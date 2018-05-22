package cn.clt.config;
import cn.clt.core.entity.AccessStatistics;
import cn.clt.core.entity.AccessStatisticsExample;
import cn.clt.core.entity.Article;
import cn.clt.core.entity.ArticleExample;
import cn.clt.core.enums.ExchangeTypeCode;
import cn.clt.core.mapper.ArticleMapper;
import cn.clt.core.property.BrowerCount;
import cn.clt.core.service.AccessStatisticsService;
import cn.clt.core.service.UserAccountService;
import cn.clt.core.utils.ExecutorUtil;
import cn.clt.core.utils.GuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

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
    @Autowired
    private BrowerCount browerCount;
    @Autowired
    private UserAccountService userAccountService;

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
     * @Description 缓存信息
     * @Author CLT
     * @Date 2018/5/14 11:58
     * @param articleId
     * @param ip
     */
    public synchronized void registration(String articleId, String ip){
        //组装key 文章id和ip为键
        String key = articleId +"_"+ ip;
        //判断缓存中的大小
        if (accessStatisticsMap.size()==browerCount.getSize()){
            put();
            if (!visitIpAddress.contains(ip)){
                visitIpAddress.add(ip);
                AccessStatistics accessStatistics = accessStatisticsMap.get(key);
                if (accessStatistics == null){
                    accessStatisticsMap.put(key,assembleAccessStatistics(articleId,ip));
                }else {
                    Integer visitCount = accessStatistics.getVisitCount();
                    visitCount = visitCount+1;
                    accessStatistics.setVisitCount(visitCount);
                    accessStatisticsMap.put(key,accessStatistics);
                }
            }else {
                AccessStatistics accessStatistics = accessStatisticsMap.get(key);
                if (accessStatistics == null){
                    accessStatisticsMap.put(key,assembleAccessStatistics(articleId,ip));
                }else {
                    Integer visitCount = accessStatistics.getVisitCount();
                    visitCount = visitCount+1;
                    accessStatistics.setVisitCount(visitCount);
                    accessStatisticsMap.put(key,accessStatistics);
                }
            }
        }else {
            if (!visitIpAddress.contains(ip)){
                visitIpAddress.add(ip);
                AccessStatistics accessStatistics = accessStatisticsMap.get(key);
                if (accessStatistics == null){
                    accessStatisticsMap.put(key,assembleAccessStatistics(articleId,ip));
                }else {
                    Integer visitCount = accessStatistics.getVisitCount();
                    visitCount = visitCount+1;
                    accessStatistics.setVisitCount(visitCount);
                    accessStatisticsMap.put(key,accessStatistics);
                }
            }else {
                AccessStatistics accessStatistics = accessStatisticsMap.get(key);
                if (accessStatistics == null){
                    accessStatisticsMap.put(key,assembleAccessStatistics(articleId,ip));
                }else {
                    Integer visitCount = accessStatistics.getVisitCount();
                    visitCount = visitCount+1;
                    accessStatistics.setVisitCount(visitCount);
                    accessStatisticsMap.put(key,accessStatistics);
                }
            }
        }
    }

    /**
     * @Title put
     * @Description 处理浏览访问记录
     * @Author CLT
     * @Date 2018/5/19 0:31
     */
    private void put(){
        System.out.println("------------------开始批量处理浏览访问记录------------------------");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                //如果缓存中数据已经满了执行入库操作
                for (Map.Entry<String, AccessStatistics> entry : accessStatisticsMap.entrySet()) {
                    AccessStatistics accessStatistics = entry.getValue();
                    AccessStatistics statistics = accessStatisticsService.getAccessStatisticsByArticleIdAndIp(accessStatistics.getArticleId(), accessStatistics.getVisitIp());
                    if (statistics != null) {
                        //存在浏览记录 则执行更新操作
                        statistics.setVisitCount(statistics.getVisitCount() + accessStatistics.getVisitCount());
                        statistics.setModifyTime(date);
                        accessStatisticsService.updateAccessStatistics(statistics);
                    } else {
                        //新增入库
                        accessStatistics.setId(GuidUtil.newGuid());
                        Article article = getArticle(accessStatistics.getArticleId());
                        if (article != null) {
                            accessStatistics.setArticleName(article.getArticleTitle());
                        }
                        accessStatistics.setCreateTime(date);
                        accessStatistics.setModifyTime(date);
                        accessStatisticsService.insertAccessStatistics(accessStatistics);
                    }
                }
                //情况缓存
                accessStatisticsMap.clear();
                //统计所有用户浏览记录
                userAccountService.statisticsUserAccount();
            }
        };
        ExecutorUtil.doInBackground(runnable);
        System.out.println("------------------批量处理浏览访问记录结束，当前缓存数据为"+accessStatisticsMap.size()+"+------------------------");
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
    private static AccessStatistics assembleAccessStatistics(String articleId, String ip){
        AccessStatistics accessStatistics = new AccessStatistics();
        accessStatistics.setArticleId(articleId);
        accessStatistics.setVisitIp(ip);
        accessStatistics.setVisitCount(1);
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

    /**
     * @Title serviceStop
     * @Description 服务停止 把缓存中数据更新
     * @Author CLT
     * @Date 2018/5/19 1:42
     */
    @PreDestroy
    public void serviceStop(){
        if (accessStatisticsMap.size()<=browerCount.getSize()) {
            put();
        }
    }
}
