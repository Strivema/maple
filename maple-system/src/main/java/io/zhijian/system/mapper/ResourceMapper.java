package io.zhijian.system.mapper;

import io.zhijian.base.mapper.BaseMapper;
import io.zhijian.system.entity.Resource;
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
public interface ResourceMapper extends BaseMapper<Resource> {

    public List<Resource> findResourceByRoleCode(@Param("roleCode")String roleCode);

    public List<Resource> findResource(@Param("parentId")Long parentId, @Param("type")String type);

    public List<Resource> findResourceByUsernameAndType(@Param("username")String username, @Param("type")String type);
}