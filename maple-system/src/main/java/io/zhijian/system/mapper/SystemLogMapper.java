package io.zhijian.system.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import io.zhijian.base.mapper.BaseMapper;
import io.zhijian.system.entity.SystemLog;
import io.zhijian.system.model.request.SystemLogRequest;
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
public interface SystemLogMapper extends BaseMapper<SystemLog> {
    public List<SystemLog> findSystemLog(Pagination page, @Param("request") SystemLogRequest request);


}