package cn.clt.core.params;

/**
 * @Description 分页
 * @Aouthor CLT
 * @Date 2018/04/02 18:07
 */
public class Pagination {
    /**起始页**/
    private Integer pageNo = 1;
    /**每页显示数量**/
    private Integer pageSize = 20;

    /**获取每次翻页的起始值**/
    public Integer getStart(){
        if (this.pageNo == Integer.MAX_VALUE){
            return 0;
        }
        return (pageNo - 1) * pageSize;
    }

    public Pagination(){}

    public Pagination(Integer pageNo, Integer pageSize){
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
