package com.wlz.entity;

import java.util.ArrayList;
import java.util.List;

public class Employee  extends BaseEntity{
    private String name;
    private String password;
    private String email;
    private Integer age;
    private boolean admin;
    private Department dept;
    private List<Role> roles = new ArrayList<Role>();


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public boolean isAdmin() {
        return admin;
    }


    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    public Department getDept() {
        return dept;
    }


    public void setDept(Department dept) {
        this.dept = dept;
    }


    public List<Role> getRoles() {
        return roles;
    }


    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        return "Employee [id=" + super.getId()+ ", name=" + name + ", password=" + password + ", email=" + email + ", age=" + age
                + ", admin=" + admin + "]";
    }
}
