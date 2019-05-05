package io.zhijian.system.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.zhijian.base.mapper.BaseMapper;
import io.zhijian.system.entity.User;
import io.zhijian.system.model.request.UserRequest;
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
public interface UserMapper extends BaseMapper<User> {
    public List<User> findUser(Pagination page, @Param("request") UserRequest request);

    public List<User> findUserByRoleCode(Pagination page, @Param("roleCode")String roleCode);
}