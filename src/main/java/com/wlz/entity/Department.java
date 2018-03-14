package com.wlz.entity;

public class Department extends BaseEntity {

    private String sn;
    private String name;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department [sn=" + sn + ", name=" + name + "]";
    }
}
