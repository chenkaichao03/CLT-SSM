package cn.clt.core.params;

/**
 * @Description 基础分页数据集
 * @Aouthor CLT
 * @Date 2018/04/02 18:13
 */
public class BasePageData {
    private Integer pageNo;
    private Integer pageSize;
    /**分页总记录数**/
    private Long totalCount;
    /**分页总页数**/
    private Long totalPage;

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

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalPage() {
        /**根据总记录数算出总页数**/
        if (this.getTotalCount() == null){
            this.totalPage = null;
        }else {
            this.totalPage = this.totalCount % this.getPageSize() == 0 ?
                    this.totalCount / this.getPageSize() : this.totalCount / this.getPageSize() + 1;
        }
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }
}
