package com.wlz.entity;

import java.util.ArrayList;
import java.util.List;

public class Role extends BaseEntity {
    private String sn;
    private String name;
    private List<Permission> permissions = new ArrayList<Permission>();
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
    public List<Permission> getPermissions() {
        return permissions;
    }
    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }


}
