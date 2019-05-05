package io.zhijian.system.service;

import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.Role;
import io.zhijian.system.model.request.RoleRequest;
import io.zhijian.system.model.response.RoleResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Role Service接口
 * @create 2017-3-28 10:45:58
 */
public interface IRoleService extends IBaseService<Role> {

    @Transactional
    public RoleResponse save(RoleRequest request);

    @Transactional
    public RoleResponse update(RoleRequest request);

    @Transactional
    public Integer del(Long id);

    public RoleResponse get(Long id);

    public List<RoleResponse> getRoles();

    public List<RoleResponse> getRoles(String username);

}
