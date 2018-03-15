package com.wlz.service;

import com.wlz.entity.Employee;
import com.wlz.page.PageResult;
import com.wlz.query.EmployeeQueryObject;

import java.util.List;

public interface EmployeeService {

    void save(Employee entity);
    void update(Employee entity);
    void delete(Long id);
    Employee get(Long id);
    List<Employee> listAll();
    /**
     * 根据前天的条件进行高级查询+分页
     * @param qo
     * @return
     */
    PageResult queryByCondition(EmployeeQueryObject qo);
    /**
     * 登录方法
     * @param username
     * @param password
     */
    void login(String username, String password);
}
