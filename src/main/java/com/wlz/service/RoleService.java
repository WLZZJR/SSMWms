package com.wlz.service;

import com.wlz.entity.Role;
import com.wlz.page.PageResult;
import com.wlz.query.QueryObject;

import java.util.List;

public interface RoleService {

    void save(Role entity);
    void update(Role entity);
    void delete(Long id);
    Role get(Long id);
    List<Role> listAll();
    /**
     * 根据前天的条件进行高级查询+分页
     * @param qo
     * @return
     */
    PageResult queryByCondition(QueryObject qo);
}
