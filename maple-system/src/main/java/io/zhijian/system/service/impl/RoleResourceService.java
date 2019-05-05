package io.zhijian.system.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.zhijian.base.service.impl.BaseService;
import io.zhijian.log.annotation.Log;
import io.zhijian.system.entity.RoleResource;
import io.zhijian.system.mapper.RoleResourceMapper;
import io.zhijian.system.service.IRoleResourceService;
import io.zhijian.utils.Utils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Resource Service实现类
 * @create 2017-3-28 10:45:58
 */
@Service
public class RoleResourceService extends BaseService<RoleResourceMapper, RoleResource> implements IRoleResourceService {

    @Transactional
    @Log(module = "系统角色", description = "修改角色权限")
    public Integer changeRolePermission(Long roleId, List<Long> targetResources) {
        if (!Utils.isEmpty(roleId)) {

            super.delete(new EntityWrapper<RoleResource>().eq("role_id", roleId));

            if (!Utils.isEmpty(targetResources)) {
                List<RoleResource> roleResources = new ArrayList<>();

                for (Long resourceId : targetResources) {
                    RoleResource roleResource = new RoleResource();
                    roleResource.setRoleId(roleId);
                    roleResource.setResourceId(resourceId);
                    roleResources.add(roleResource);
                }

                super.insertBatch(roleResources);

                return 1;
            }
        }
        return -1;
    }
}
