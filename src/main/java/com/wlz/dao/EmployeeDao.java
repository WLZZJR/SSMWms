package com.wlz.dao;

import com.wlz.entity.Employee;
import com.wlz.query.EmployeeQueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeDao {

    void save(Employee entity);
    void update(Employee entity);
    void delete(Long id);
    Employee get(Long id);
    List<Employee> listAll();

    /**
     * 查询总数
     * @param qo
     * @return
     */
    Long queryByConditionCount(EmployeeQueryObject qo);
    /**
     * 查询结果集
     * @param qo
     * @return
     */
    List<Employee> queryByCondition(EmployeeQueryObject qo);
    /**
     * 插入中间表的关系
     * @param roleId
     * @param employeeId
     */
    void insertRelation(@Param("roleId")Long roleId, @Param("employeeId")Long employeeId);
    /**
     * 删除中间表的关系
     * @param employeeId
     */
    void deleteRelation(Long employeeId);
    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    Employee login(@Param("username")String username,@Param("password") String password);
}
