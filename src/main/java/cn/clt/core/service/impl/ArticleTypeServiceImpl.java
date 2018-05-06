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
    public List<ArticleType> listArticleType() {
        ArticleCode[] articleCodes = ArticleCode.values();
        List<String> articleCodeList = new LinkedList<>();
        for (int i=0; i< articleCodes.length;i++){
            articleCodeList.add(articleCodes[i].name());
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
