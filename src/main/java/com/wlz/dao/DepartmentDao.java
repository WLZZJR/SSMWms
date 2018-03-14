package com.wlz.dao;

import com.wlz.entity.Department;

import java.util.List;

public interface DepartmentDao {

    int save(Department entity);
    int update(Department entity);
    int delete(Long id);
    Department get(Long id);
    List<Department> listAll();
}
