package cn.clt.core.enums;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description ArticleCode
 * @Aouthor CLT
 * @Date 2018/04/25 14:57
 */
public enum ArticleCode {
    ENTERTAINMENT,//娱乐
    NEWS,//新闻
    ACTIVITY,//活动
    AFFICHE,//公告
    HOT,//热门
    HEADLINE,//头条
    NOTICE;//通知

    private ArticleCode(){}


    public static List<String> getArticleCode(){
        List<String> articleCodes = new LinkedList<>();
        articleCodes.add(ArticleCode.ENTERTAINMENT.name());
        articleCodes.add(ArticleCode.NEWS.name());
        articleCodes.add(ArticleCode.HOT.name());
        articleCodes.add(ArticleCode.HEADLINE.name());
        return articleCodes;
    }

}
