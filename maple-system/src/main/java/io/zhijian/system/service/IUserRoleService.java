package io.zhijian.system.service;

import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.UserRole;

import java.util.List;

/**
 * Role Service接口
 * @create 2017-3-28 10:45:58
 */
public interface IUserRoleService extends IBaseService<UserRole> {

    public int deleteUserRole(Long userId, Long roleId);

    public Integer changeUserRole(Long userId, List<Long> targetRoles);

}
