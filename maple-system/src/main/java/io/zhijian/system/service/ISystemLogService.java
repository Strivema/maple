package io.zhijian.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.SystemLog;
import io.zhijian.system.model.request.SystemLogRequest;
import io.zhijian.system.model.response.SystemLogResponse;

/**
 * SystemLog Service接口
 * @create 2017-3-29 21:34:13
 */
public interface ISystemLogService extends IBaseService<SystemLog> {

    public Page<SystemLogResponse> getPage(Page<SystemLog> page, SystemLogRequest request);
}
