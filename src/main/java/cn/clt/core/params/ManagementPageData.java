package cn.clt.core.params;

import cn.clt.core.entity.Article;
import cn.clt.core.entity.UserExchange;
import cn.clt.core.vo.UserInfoVO;

import java.util.List;

/**
 * @Description 查询分页数据集合
 * @Aouthor CLT
 * @Date 2018/04/02 18:37
 */
public class ManagementPageData extends BasePageData{
    /**分页数据集**/
    private List<Article> articleList;
    private List<UserInfoVO> concernList;
    private List<UserInfoVO> fansList;
    private List<UserInfoVO> userList;
    private List<UserExchange> userExchangeList;

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public List<UserInfoVO> getConcernList() {
        return concernList;
    }

    public void setConcernList(List<UserInfoVO> concernList) {
        this.concernList = concernList;
    }

    public List<UserInfoVO> getFansList() {
        return fansList;
    }

    public void setFansList(List<UserInfoVO> fansList) {
        this.fansList = fansList;
    }

    public List<UserInfoVO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserInfoVO> userList) {
        this.userList = userList;
    }

    public List<UserExchange> getUserExchangeList() {
        return userExchangeList;
    }

    public void setUserExchangeList(List<UserExchange> userExchangeList) {
        this.userExchangeList = userExchangeList;
    }
}
