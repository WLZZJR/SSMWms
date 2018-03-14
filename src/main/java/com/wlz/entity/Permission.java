package com.wlz.entity;

public class Permission extends BaseEntity {
    private String name;//权限的名称
    private String expression;//权限表达式,主要是定位到那个方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }


}
