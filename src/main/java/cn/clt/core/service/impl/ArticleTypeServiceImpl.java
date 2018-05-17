package cn.clt.core.service.impl;

import cn.clt.core.entity.Article;
import cn.clt.core.entity.ArticleType;
import cn.clt.core.entity.ArticleTypeExample;
import cn.clt.core.entity.UserInfo;
import cn.clt.core.enums.ArticleCode;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.mapper.ArticleMapper;
import cn.clt.core.mapper.ArticleTypeMapper;
import cn.clt.core.service.ArticleTypeService;
import cn.clt.core.service.UserInfoService;
import cn.clt.core.utils.GuidUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;

/**
 * @Description ArticleTypeServiceImpl
 * @Aouthor CLT
 * @Date 2018/04/25 14:33
 */
@Service
public class ArticleTypeServiceImpl implements ArticleTypeService{

    private static final Logger logger = LoggerFactory.getLogger(ArticleTypeServiceImpl.class);
    @Autowired
    private ArticleTypeMapper articleTypeMapper;


    /**
     * @Title listArticleType
     * @Description 获取所有可用的文章类型
     * @Author CLT
     * @Date 2018/4/25 14:35
     * @return
     */
    @Override
    public List<ArticleType> listArticleType(String role) {
/*        ArticleCode[] articleCodes = ArticleCode.values();
        List<String> articleCodeList = new LinkedList<>();
        for (int i=0; i< articleCodes.length;i++){
            articleCodeList.add(articleCodes[i].name());
        }*/
        List<String> articleCodeList = new LinkedList<>();
        if (role.equals("admin")) {
            //管理员  通知，公告，活动，头条
            articleCodeList.add(ArticleCode.ACTIVITY.name());
            articleCodeList.add(ArticleCode.AFFICHE.name());
            articleCodeList.add(ArticleCode.NOTICE.name());
            articleCodeList.add(ArticleCode.HEADLINE.name());
        }else if (role.equals("user")){
            //普通用户 新闻，娱乐，热文
            articleCodeList.add(ArticleCode.ENTERTAINMENT.name());
            articleCodeList.add(ArticleCode.NEWS.name());
            articleCodeList.add(ArticleCode.HOT.name());
        }
        ArticleTypeExample example = new ArticleTypeExample();
        example.createCriteria().andArticleTypeCodeIn(articleCodeList);
        List<ArticleType> articleTypeList = articleTypeMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(articleTypeList)){
            return articleTypeList;
        }
        return null;
    }

    /**
     * @Title addArticleType
     * @Description 添加文章类型
     * @Author CLT
     * @Date 2018/4/25 15:08
     * @param articleType
     */
    @Override
    public void addArticleType(ArticleType articleType) {
        Date date = new Date();
        //获取最大排序位
        Integer sortOrder = getArticleTypeMaxSortOrder();
        articleType.setId(GuidUtil.newGuid());
        articleType.setSortOrder(sortOrder+1);
        articleType.setCreateTime(date);
        articleType.setModifyTime(date);
        articleTypeMapper.insert(articleType);
    }

    /**
     * @Title getArticleTypeByName
     * @Description 获取文章类型通过名称
     * @Author CLT
     * @Date 2018/5/7 14:33
     * @param articleTypeName
     * @return
     */
    @Override
    public ArticleType getArticleTypeByName(String articleTypeName) {
        ArticleTypeExample example = new ArticleTypeExample();
        example.createCriteria().andArticleTypeCodeEqualTo(articleTypeName);
        List<ArticleType> articleTypeList = articleTypeMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(articleTypeList)){
            return articleTypeList.get(0);
        }
        return null;
    }

    /**
     * @Title getArticleTypeMaxSortOrder
     * @Description 获取文章类型最大排序位
     * @Author CLT
     * @Date 2018/4/25 15:11
     * @return
     */
    private Integer getArticleTypeMaxSortOrder(){
        ArticleTypeExample example = new ArticleTypeExample();
        example.createCriteria().andCreateUserNameEqualTo("admin");
        example.setOrderByClause("sort_order Desc");
        List<ArticleType> articleTypeList = articleTypeMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(articleTypeList)){
            return articleTypeList.get(0).getSortOrder();
        }
        return 0;
    }
}
