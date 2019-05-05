package io.zhijian.system.mapper;

import io.zhijian.base.mapper.BaseMapper;
import io.zhijian.system.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Hao
 * @since 2017-07-05
 */
public interface RoleMapper extends BaseMapper<Role> {
    public List<Role> findRoleByUsername(@Param("username")String username);
}