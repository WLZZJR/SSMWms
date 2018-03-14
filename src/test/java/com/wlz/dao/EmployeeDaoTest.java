package com.wlz.dao;

import com.wlz.BaseTest;
import com.wlz.entity.Employee;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDaoTest extends BaseTest {

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void getById(){

        Employee employee=employeeDao.get(1L);

        System.out.println(employee);
        System.out.println(employee.getDept().getName());
    }
}
