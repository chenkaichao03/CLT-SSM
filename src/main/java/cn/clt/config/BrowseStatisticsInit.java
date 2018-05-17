package cn.clt.config;
import cn.clt.core.entity.AccessStatistics;
import cn.clt.core.entity.Article;
import cn.clt.core.entity.ArticleExample;
import cn.clt.core.mapper.ArticleMapper;
import cn.clt.core.service.AccessStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * @Description 统计用户浏览量前的初始化
 * @Aouthor CLT
 * @Date 2018/05/14 9:54
 */
@Component
public class BrowseStatisticsInit {
    @Autowired
    private AccessStatisticsService accessStatisticsService;
    @Autowired
    private ArticleMapper articleMapper;

    //缓存当前的ip地址
    public static Vector<String> visitIpAddress;

    //缓存访问的信息记录
    private static Map<String,AccessStatistics> accessStatisticsMap =  new HashMap<>();

    //初始化
    @PostConstruct
    public void init(){
        System.out.println("------------------初始化所有ip地址------------------------");
        visitIpAddress = accessStatisticsService.visitIps();
        System.out.println("-------------------当前ip地址有"+visitIpAddress.size()+"个---------------------");
    }


    /**
     * @Title registration
     * @Description
     * @Author CLT
     * @Date 2018/5/14 11:58
     * @param articleId
     * @param ip
     */
    public static void registration(String articleId, String ip){
        //组装key 文章id和ip为键
        String key = articleId + ip;
        boolean flag = false;
        if (!CollectionUtils.isEmpty(visitIpAddress)){
            if (visitIpAddress.contains(ip)){
                flag = true;
            }
        }
        if (!flag){
            //添加ip地址到当前存现中
            visitIpAddress.add(ip);
            accessStatisticsMap.put(key,getAccessStatistics(articleId,ip));
            return;
        }
        //从缓存中获取
        AccessStatistics accessStatistics = accessStatisticsMap.get(key);
        if (accessStatistics == null){
            //添加到当前缓存中
            accessStatisticsMap.put(key,getAccessStatistics(articleId,ip));
        }else {
            //自增
            Integer currentCount = accessStatistics.getVisitCount();
            accessStatistics.setVisitCount(currentCount++);
        }
    }

    /**
     * @Title getAccessStatistics
     * @Description 组装新的浏览访问记录
     * @Author CLT
     * @Date 2018/5/14 11:45
     * @param articleId
     * @param ip
     * @return
     */
    private static AccessStatistics getAccessStatistics(String articleId, String ip){
        AccessStatistics accessStatistics = new AccessStatistics();
        accessStatistics.setArticleId(articleId);
        accessStatistics.setVisitIp(ip);
        accessStatistics.setVisitCount(0);
        return accessStatistics;
    }


    /**
     * @Title getArticle
     * @Description 根据id获取文章
     * @Author CLT
     * @Date 2018/5/14 11:50
     * @param articleId
     * @return
     */
    private Article getArticle(String articleId){
        ArticleExample example = new ArticleExample();
        example.createCriteria().andIdEqualTo(articleId).andStatusEqualTo(1);
        List<Article> articleList = articleMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(articleList)){
            return articleList.get(0);
        }
        return null;
    }
}
