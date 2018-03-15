package com.wlz.service.impl;

import com.wlz.dao.DepartmentDao;
import com.wlz.entity.Department;
import com.wlz.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;


    public void setDepartmentDao(DepartmentDao departmentDao){
        this.departmentDao=departmentDao;
    }

    @Override
    public void save(Department entity) {

        departmentDao.save(entity);

    }

    @Override
    public void update(Department entity) {

        departmentDao.update(entity);
    }

    @Override
    public void delete(Long id) {

        departmentDao.delete(id);
    }

    @Override
    public Department get(Long id) {
        return departmentDao.get(id);
    }

    @Override
    public List<Department> listAll() {
        return departmentDao.listAll();
    }
}
