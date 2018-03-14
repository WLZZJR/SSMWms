package com.wlz.dao;

import com.wlz.entity.Role;
import com.wlz.query.QueryObject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {

    int save(Role entity);
    int update(Role entity);
    int delete(Long id);
    Role get(Long id);
    List<Role> listAll();
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
    List<Role> queryByCondition(QueryObject qo);
    /**
     * 处理中间表的关系
     * @param roleId
     * @param permissionId
     */
    void insertRelation(@Param("roleId")Long roleId, @Param("permissionId")Long permissionId);
    /**
     * 删除中间表的关系
     * @param roleId
     */
    void deleteRelation(Long roleId);
}
