package io.zhijian.system.service;

import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.RoleResource;

import java.util.List;

/**
 * Resource Service接口
 * @create 2017-3-28 10:45:58
 */
public interface IRoleResourceService extends IBaseService<RoleResource> {
    public Integer changeRolePermission(Long roleId, List<Long> targetResources);
}
