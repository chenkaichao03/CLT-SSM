package cn.clt.core.params;

import cn.clt.core.entity.Article;

import java.util.List;

/**
 * @Description 查询分页数据集合
 * @Aouthor CLT
 * @Date 2018/04/02 18:37
 */
public class ManagementPageData extends BasePageData{
    /**分页数据集**/
    //文章
    private List<Article> articleList;

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}
