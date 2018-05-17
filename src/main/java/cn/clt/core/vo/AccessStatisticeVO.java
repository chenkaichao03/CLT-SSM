package cn.clt.core.vo;

/**
 * @Description
 * @Aouthor CLT
 * @Date 2018/05/14 10:34
 */
public class AccessStatisticeVO {
    private String articleId;
    private Integer visitTotalCount;
    private String visitIp;


    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public Integer getVisitTotalCount() {
        return visitTotalCount;
    }

    public void setVisitTotalCount(Integer visitTotalCount) {
        this.visitTotalCount = visitTotalCount;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp;
    }
}
