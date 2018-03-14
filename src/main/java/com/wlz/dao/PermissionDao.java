package com.wlz.dao;

import com.wlz.entity.Permission;
import com.wlz.query.QueryObject;

import java.util.List;

public interface PermissionDao {

    void save(Permission entity);
    void delete(Long id);
    List<Permission> listAll();
    /**
     * 查询总数
     * @param qo
     * @return
     */
    Long queryByConditionCount(QueryObject qo);
    /**
     * 查询结果集
     * @param qo
     * @return
     */
    List<Permission> queryByCondition(QueryObject qo);
    /**
     * 根据员工的ID查询该员工拥有的权限有哪些
     * @param employeeId
     * @return
     */
    List<Permission> selectByEmployeeId(Long employeeId);
}
