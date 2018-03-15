package com.wlz.page;

import java.util.List;

public class PageResult {

    private Integer totalCount;
    private List<?> data;
    private Integer currentPage;
    private Integer pageSize;
    private Integer prevPage;
    private Integer nextPage;
    private Integer totalPage;
    public PageResult(Integer totalCount, List<?> data, Integer currentPage, Integer pageSize) {
        super();
        this.totalCount = totalCount;
        this.data = data;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalPage = totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize+1);
        this.prevPage = currentPage-1>1?currentPage-1:1;
        this.nextPage = currentPage+1<totalPage?currentPage+1:totalPage;
    }


    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(Integer prevPage) {
        this.prevPage = prevPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
