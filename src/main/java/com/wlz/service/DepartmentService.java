package com.wlz.service;

import com.wlz.entity.Department;

import java.util.List;

public interface DepartmentService {

    void save(Department entity);
    void update(Department entity);
    void delete(Long id);
    Department get(Long id);
    List<Department> listAll();
}
