package com.wlz.dao;

import com.wlz.BaseTest;
import com.wlz.entity.Employee;
import com.wlz.query.EmployeeQueryObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDaoTest extends BaseTest {

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void getById(){

        Employee employee=employeeDao.get(1L);

        System.out.println(employee);
        System.out.println(employee.getDept().getName());
    }

    @Test
    public void getAll(){

        List<Employee> list=employeeDao.listAll();

        for (Employee employee:list){

            System.out.println(employee+""+employee.getDept().getName());

        }
    }

    @Test
    public void getByConditionCount(){

        EmployeeQueryObject object=new EmployeeQueryObject();

        //object.setDeptId(1L);
        //object.setKeyword("赵");

        Long num=employeeDao.queryByConditionCount(object);

        System.out.println(num);
    }


    @Test
    public void login(){

        //Employee employee=employeeDao.login()
    }



}
