package com.wlz.service.impl;

import com.wlz.dao.EmployeeDao;
import com.wlz.entity.Employee;
import com.wlz.page.PageResult;
import com.wlz.query.EmployeeQueryObject;
import com.wlz.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;



    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void save(Employee entity) {

        employeeDao.save(entity);
    }

    @Override
    public void update(Employee entity) {

        employeeDao.update(entity);
    }

    @Override
    public void delete(Long id) {

        employeeDao.delete(id);
    }

    @Override
    public Employee get(Long id) {
       return employeeDao.get(id);
    }

    @Override
    public List<Employee> listAll() {
        return employeeDao.listAll();
    }

    @Override
    public PageResult queryByCondition(EmployeeQueryObject qo) {
        return null;
    }

    @Override
    public void login(String username, String password) {

    }
}
