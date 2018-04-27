package cn.clt.core.service.impl;

import cn.clt.core.entity.Article;
import cn.clt.core.entity.ArticleExample;
import cn.clt.core.exception.BussinessException;
import cn.clt.core.mapper.ArticleMapper;
import cn.clt.core.params.ManagementPageData;
import cn.clt.core.params.Pagination;
import cn.clt.core.service.ArticleService;
import cn.clt.core.utils.GuidUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
 * @Description ArticleServiceImpl
 * @Aouthor CLT
 * @Date 2018/04/25 17:42
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    private static final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

    @Autowired
    private ArticleMapper articleMapper;

    /**
     * @Title seletArticlePage
     * @Description 获取用户文章
     * @Author CLT
     * @Date 2018/4/26 10:05
     * @param userId
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public ManagementPageData seletArticlePage(String userId,Integer pageNo,Integer pageSize) {
        Pagination pagination = new Pagination(pageNo,pageSize);
        Map<String,Object> param = new HashMap<>();
        param.put("createUserId",userId);
        param.put("pagination",pagination);
        List<Article> articleList = articleMapper.listArticle(param);
        Long cout = articleMapper.countArticle(param);
        ManagementPageData managementPageData = new ManagementPageData();
        managementPageData.setArticleList(articleList);
        managementPageData.setTotalCount(cout);
        managementPageData.setPageNo(pageNo-1);
        managementPageData.setPageSize(pageSize);
        return managementPageData;
    }


    /**
     * @Title getArticleByUserId
     * @Description 获取用户文章
     * @Author CLT
     * @Date 2018/4/26 10:24
     * @param userId
     * @return
     */
    @Override
    public List<Article> getArticleByUserId(String userId) {
        ArticleExample example = new ArticleExample();
        example.createCriteria().andCreateUserIdEqualTo(userId).andStatusEqualTo(1);
        List<Article> articleList = articleMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(articleList)){
            return articleList;
        }
        return null;
    }

    /**
     * @Title getArticleByIdAndUserId
     * @Description 根据id获取文章
     * @Author CLT
     * @Date 2018/4/26 10:35
     * @param id
     * @param userId
     * @return
     */
    @Override
    public Article getArticleByIdAndUserId(String id, String userId) {
        ArticleExample example = new ArticleExample();
        example.createCriteria().andIdEqualTo(id).andCreateUserIdEqualTo(userId).andStatusEqualTo(1);
        List<Article> articleList = articleMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(articleList)){
            return articleList.get(0);
        }
        return null;
    }

    /**
     * @Title deleteArticle
     * @Description 删除文章
     * @Author CLT
     * @Date 2018/4/26 10:47
     * @param id
     * @param userId
     * @return
     */
    @Override
    public int deleteArticle(String id, String userId) {
        Article article = getArticleByIdAndUserId(id,userId);
        if (article != null){
            article.setStatus(0);
            return articleMapper.updateByPrimaryKeySelective(article);
        }
        return 0;
    }

    /**
     * @Title addArticle
     * @Description 添加文章
     * @Author CLT
     * @Date 2018/4/25 17:07
     * @param file
     * @param article
     * @param userId
     * @param path
     */
    @Override
    public void addArticle(MultipartFile file, Article article, String userId, String path) {
        try {
            //头像上传
            if (file != null) {
                //获取上传图片全称
                String originalFileName = file.getOriginalFilename();
                //写入图片
                originalFileName = transferToAticlt(originalFileName,path,file);
                //添加文章
                insertArticle(article,userId,originalFileName,path);
            } else {
                return;
            }
        }catch (BussinessException e){
            throw new BussinessException(e.getMessage());
        }
    }


    /**
     * @Title insertArticle
     * @Description 添加文章
     * @Author CLT
     * @Date 2018/4/25 17:26
     * @param article
     */
    private void insertArticle(Article article,String userId,String originalFileName,String path){
        Date date = new Date();
        //新增 新增不进行图片的删除操作
        if (StringUtils.isEmpty(article.getId())){
            article.setId(GuidUtil.newGuid());
            if (!StringUtils.isEmpty(originalFileName)){
                article.setArticlePicture(originalFileName);
            }
            article.setStatus(1);
            article.setCreateUserId(userId);
            article.setCreateDate(date);
            article.setModifyDate(date);
            article.setModifyUserId(userId);
            articleMapper.insert(article);
        }else {
            //编辑
            if (!StringUtils.isEmpty(originalFileName)){
                //根据id获取文章信息
                Article articleObj = articleMapper.selectByPrimaryKey(article.getId());
                String articlePicture = articleObj.getArticlePicture();
                //并进行图片的删除操作
                if (!StringUtils.isEmpty(articlePicture)){
                    articlePicture = articlePicture.substring(articlePicture.lastIndexOf("/"),articlePicture.length());
                    File file = new File(path,articlePicture);
                    if (file.exists()){
                        file.exists();
                    }
                }
                article.setArticlePicture(originalFileName);
            }
            article.setStatus(1);
            article.setModifyUserId(userId);
            article.setModifyDate(date);
            articleMapper.updateByPrimaryKeySelective(article);
        }
    }


    /**
     * @Title transferToAticlt
     * @Description 插入图片
     * @Author CLT
     * @Date 2018/4/25 17:26
     * @param originalFileName
     * @param path
     * @param file
     */
    private String transferToAticlt(String originalFileName,String path,MultipartFile file){
        try {
            if (!StringUtils.isEmpty(originalFileName)) {
                //获取图片格式
                String pictureFormat = originalFileName.substring(originalFileName.lastIndexOf("."), originalFileName.length());
                //随机数
                String pictureRandom = new Date().getTime() + "_" + new Random().nextInt(1000);
                //组装新的图片全称
                originalFileName = pictureRandom + pictureFormat;//新的文件名
                //判断文件夹是否存在
                File pathFile = new File(path);
                if (!pathFile.getParentFile().exists()) {
                    pathFile.getParentFile().mkdir();
                }
                File targetFile = new File(pathFile, originalFileName);
                //写入到服务器上
                file.transferTo(targetFile);
                return originalFileName;
            }else {
                return null;
            }
        }catch (Exception e){
            throw new BussinessException("上传图片失败.");
        }
    }

}
