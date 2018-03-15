package com.wlz.dao;

import com.wlz.BaseTest;
import com.wlz.entity.Department;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentDaoTest extends BaseTest {

    @Autowired
    private DepartmentDao departmentDao;


    @Test
    public void save(){

    }

    @Test
    public void get(){

        Department department=departmentDao.get(1L);

        System.out.println(department);
    }

    @Test
    public void getAll(){

        List<Department> departmentAll=departmentDao.listAll();

        for(Department department:departmentAll){

            System.out.println(department);
        }
    }

    @Test
    public void delete(){

        departmentDao.delete(11L);


    }


    @Test
    public void update(){
        Department department=new Department();
        department.setId(12L);
        department.setName("总经办");
        department.setSn("CEO");
        departmentDao.update(department);


    }
}
