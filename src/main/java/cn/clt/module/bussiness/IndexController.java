package cn.clt.module.bussiness;

import cn.clt.core.vo.ActiveUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Description IndexController
 * @Aouthor CLT
 * @Date 2018/04/13 16:14
 */
@Controller
@RequestMapping(value = "/home", produces = {"application/json;charset=UTF-8"})
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    /**
     * @Title index
     * @Description 首页
     * @Author CLT
     * @Date 2018/4/13 16:18
     * @param model
     * @return
     */
    @RequestMapping(value = "index", produces = {"application/json;charset=UTF-8"})
    public String index(HttpSession session, Model model){
        //获取用户信息
        ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
        model.addAttribute("activeUser",activeUser);
        return "home";
    }
}
