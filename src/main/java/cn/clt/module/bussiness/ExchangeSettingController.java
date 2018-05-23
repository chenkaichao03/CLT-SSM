package cn.clt.module.bussiness;

import cn.clt.core.entity.ExchangeSetting;
import cn.clt.core.entity.User;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.Code;
import cn.clt.core.enums.ExchangeTypeCode;
import cn.clt.core.enums.RoleCode;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Result;
import cn.clt.core.service.ActiveUserService;
import cn.clt.core.service.ExchangeSettingService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.service.UserService;
import cn.clt.core.vo.ActiveUser;
import cn.clt.core.vo.ExchangeOperationVO;
import cn.clt.core.vo.UserProfitVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description 兑换
 * @Aouthor CLT
 * @Date 2018/05/09 17:08
 */
@Controller
@RequestMapping(value = "/exchange", produces = {"application/json;charset=UTF-8"})
public class ExchangeSettingController {

    private static final Logger logger = LoggerFactory.getLogger(ExchangeSettingController.class);

    @Autowired
    private ActiveUserService activeUserService;
    @Autowired
    private ExchangeSettingService exchangeSettingService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserInfoService userInfoService;



    /**
     * @Title exchangeInit
     * @Description 获取兑换设置初始化
     * @Author CLT
     * @Date 2018/5/9 18:03
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/init")
    public String exchangeInit(HttpSession session, Model model){
        try{
            //获取用户信息
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            if (activeUser.getRole().equals(RoleCode.USER.getValue())){
                throw new BussinessException("无权限操作.");
            }
            String userId = activeUser.getUserId();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            model.addAttribute("userInfo",userInfo);
            //获取用户信息 用于判断是否是管理员
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
            //获取管理员设置的兑换比例
            List<ExchangeSetting> exchangeSettingList = exchangeSettingService.listExchangeSetting(RoleCode.ADMIN.getValue());
            //分类
            if (!CollectionUtils.isEmpty(exchangeSettingList)){
                for (ExchangeSetting exchangeSetting : exchangeSettingList){
                    String exchangeType = exchangeSetting.getExchangeType();
                    if (exchangeType.equals(ExchangeTypeCode.FANS.name())){
                        model.addAttribute("fans",exchangeSetting);
                    }else if (exchangeType.equals(ExchangeTypeCode.BROWSE.name())){
                        model.addAttribute("browse",exchangeSetting);
                    }else if (exchangeType.equals(ExchangeTypeCode.COMMENT.name())){
                        model.addAttribute("comment",exchangeSetting);
                    }else if(exchangeType.equals(ExchangeTypeCode.FABULOUS.name())){
                        model.addAttribute("fabulous",exchangeSetting);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取兑换设置初始化失败.");
            throw new BussinessException("获取兑换设置初始化失败.");
        }
        return "proportion";
    }

    /**
     * @Title exchangeSetting
     * @Description 兑换设置
     * @Author CLT
     * @Date 2018/5/9 17:42
     * @param session
     * @param exchangeSetting
     * @return
     */
    @RequestMapping("/setting")
    @ResponseBody
    public String exchangeSetting(HttpSession session, ExchangeSetting exchangeSetting){
        try {
            //校验
            if (exchangeSetting.getExchangeRateMoney()==0 || exchangeSetting.getExchangeRateNumber()==0){
                return Result.error("兑换数:兑换金额必须大于0");
            }
            if (!ExchangeTypeCode.checkExchangeType(exchangeSetting.getExchangeType())){
                return Result.error("错误的兑换类型.");
            }
            //获取用户信息
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            if (activeUser.getRole().equals(RoleCode.USER.getValue())){
                throw new BussinessException("无权限操作.");
            }
            String userId = activeUser.getUserId();
            exchangeSetting.setCreateUserId(userId);
            exchangeSetting.setModifyUserId(userId);
            return Result.ok(Code.OK.getValue(),"兑换设置成功.",
                    exchangeSettingService.exchangeSetting(exchangeSetting));
        }catch (Exception e){
            e.printStackTrace();
            logger.error("兑换设置失败.");
            return Result.error("兑换设置失败.");
        }
    }

    /**
     * @Title exchangeReport
     * @Description 兑换报表
     * @Author CLT
     * @Date 2018/5/10 14:05
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/report")
    public String exchangeReport(HttpSession session, Model model,
                                 String exchangeType,
                                 @RequestParam(defaultValue = "1") Integer pageNo,
                                 @RequestParam(defaultValue = "10") Integer pageSize){
        try {
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            String userId = activeUser.getUserId();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            model.addAttribute("userInfo",userInfo);
            //获取用户信息 用于判断是否是管理员
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
            ManagementPageData pageData = exchangeSettingService.selectPageUserExchange(userId,exchangeType,pageNo,pageSize);
            UserProfitVO userProfit = null;
            if (!CollectionUtils.isEmpty(pageData.getUserExchangeList())) {
                userProfit = exchangeSettingService.getUserProfit(pageData.getUserExchangeList());
            }
            model.addAttribute("pageData",pageData);
            model.addAttribute("userProfit",userProfit);
            model.addAttribute("exchangeTypeSearch",exchangeType);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取兑换报表失败.");
            throw new BussinessException("获取兑换报表失败.");
        }
        return "myprofit";
    }

    /**
     * @Title exchangeCentreInit
     * @Description 兑换中心初始化
     * @Author CLT
     * @Date 2018/5/11 15:13
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/center/init")
    public String exchangeCentreInit(HttpSession session, Model model){
        try {
            ActiveUser activeUser = activeUserService.getActiveUser(session);
            String userId = activeUser.getUserId();
            List<UserInfo> userInfoList = userInfoService.listUserInfoByUsreId(userId);
            UserInfo userInfo = null;
            if (!CollectionUtils.isEmpty(userInfoList)){
                userInfo = userInfoList.get(0);
            }
            model.addAttribute("userInfo",userInfo);
            //获取用户信息 用于判断是否是管理员
            User user = userService.getUserById(userId);
            if (user != null) {
                model.addAttribute("userRole", user);
            }
            //获取管理员设置的兑换比例
            List<ExchangeSetting> exchangeSettingList = exchangeSettingService.listExchangeSetting(RoleCode.ADMIN.getValue());
            //分类
            if (!CollectionUtils.isEmpty(exchangeSettingList)){
                for (ExchangeSetting exchangeSetting : exchangeSettingList){
                    String exchangeType = exchangeSetting.getExchangeType();
                    if (exchangeType.equals(ExchangeTypeCode.FANS.name())){
                        model.addAttribute("fans",exchangeSetting);
                    }else if (exchangeType.equals(ExchangeTypeCode.BROWSE.name())){
                        model.addAttribute("browse",exchangeSetting);
                    }else if (exchangeType.equals(ExchangeTypeCode.COMMENT.name())){
                        model.addAttribute("comment",exchangeSetting);
                    }else if(exchangeType.equals(ExchangeTypeCode.FABULOUS.name())){
                        model.addAttribute("fabulous",exchangeSetting);
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取兑换比例失败.");
            throw new BussinessException("获取兑换比例失败.");
        }
        return "profitcenter";
    }

    /**
     * @Title getExchangeSetting
     * @Description 根据id获取兑换设置
     * @Author CLT
     * @Date 2018/5/11 16:18
     * @param id
     * @return
     */
    @RequestMapping("/get")
    @ResponseBody
    public String getExchangeSetting(@RequestParam String id){
        try {
            if (StringUtils.isEmpty(id)){
                return Result.error("参数错误");
            }
            ExchangeSetting exchangeSetting = exchangeSettingService.getExchangeSettingById(id);
            if (exchangeSetting != null) {
                return Result.ok(Code.OK.getValue(), "获取兑换设置成功.", exchangeSetting);
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error("获取兑换设置失败.");
            return Result.error("获取兑换设置失败.");
        }
        return Result.error("获取兑换设置失败.");
    }

    /**
     * @Title doExchangeOperation
     * @Description 兑换操作
     * @Author CLT
     * @Date 2018/5/21 18:11
     * @param exchangeOperationVO
     * @return
     */
    @RequestMapping("/operation")
    @ResponseBody
    public String doExchangeOperation(ExchangeOperationVO exchangeOperationVO){
        try{
            //校验
            String result = exchangeSettingService.checkExchangeOperation(exchangeOperationVO);
            if (result != null){
                return result;
            }
            int doresult = exchangeSettingService.doExchangeOperation(exchangeOperationVO.getUserId(),exchangeOperationVO.getExchangeSettingId(),exchangeOperationVO.getExchangeNumber());
            if (doresult == 0){
                return Result.error("兑换失败.");
            }
            return Result.ok(Code.OK.getValue(),"兑换成功.",null);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("兑换失败.");
            return Result.error("兑换失败.");
        }
    }

}
