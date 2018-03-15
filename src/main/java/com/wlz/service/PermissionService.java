package com.wlz.service;

import com.wlz.entity.Permission;
import com.wlz.page.PageResult;
import com.wlz.query.QueryObject;

import java.util.List;

public interface PermissionService {

    void save(Permission entity);
    void delete(Long id);
    List<Permission> listAll();
    /**
     * 根据前天的条件进行高级查询+分页
     * @param qo
     * @return
     */
    PageResult queryByCondition(QueryObject qo);
    /**
     * 扫描Action中所有的方法,把贴了RequiredPermission注解的方法--->Permission对象,保存入库
     */
    void reload();
    List<Permission> selectByEmployeeId(Long employeeId);
}
