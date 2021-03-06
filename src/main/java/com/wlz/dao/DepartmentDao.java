package com.wlz.dao;

import com.wlz.entity.Department;

import java.util.List;

public interface DepartmentDao {

    void save(Department entity);
    void update(Department entity);
    void delete(Long id);
    Department get(Long id);
    List<Department> listAll();
}
