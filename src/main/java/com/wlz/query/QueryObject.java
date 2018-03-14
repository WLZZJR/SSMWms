package com.wlz.query;

public class QueryObject {

    private Integer currentPage = 1;
    private Integer pageSize = 10;



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



    public Integer getStart(){
        return (this.currentPage-1)*pageSize;
    }
}
