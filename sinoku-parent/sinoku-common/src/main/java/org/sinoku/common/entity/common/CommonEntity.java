package org.sinoku.common.entity.common;

/**
 * 公共实体
 */
public class CommonEntity implements java.io.Serializable {

    private static final long serialVersionUID = 357767957698875765L;

    /**
     * 页面索引
     */
    private Integer pageIndex;

    /**
     * 页面条数
     */
    private Integer pageSize;

    private Integer total;

    /**
     * 排序字段
     */
    private String orderBy;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
