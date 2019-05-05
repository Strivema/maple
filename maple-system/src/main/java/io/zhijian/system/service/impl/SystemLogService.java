package io.zhijian.system.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import io.zhijian.base.common.Const;
import io.zhijian.base.service.impl.BaseService;
import io.zhijian.log.aop.LogPoint;
import io.zhijian.system.entity.SystemLog;
import io.zhijian.system.mapper.SystemLogMapper;
import io.zhijian.system.model.request.SystemLogRequest;
import io.zhijian.system.model.response.SystemLogResponse;
import io.zhijian.system.model.response.UserResponse;
import io.zhijian.system.service.ISystemLogService;
import io.zhijian.utils.IPUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

/**
 * SystemLog Service实现类
 *
 * @create 2017-3-29 21:34:13
 */
@Service
public class SystemLogService extends BaseService<SystemLogMapper, SystemLog> implements ISystemLogService, LogPoint {

    private static final String LOG_CONTENT = "[类名]:%s,[方法]:%s,[参数]:%s,[IP]:%s";

    @Override
    @Transactional
    public void save(ProceedingJoinPoint joinPoint, String methodName, String module, String description) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String username = null;
        if (request.getSession().getAttribute(Const.SESSION_USER) != null) {
            UserResponse user = (UserResponse) request.getSession().getAttribute(Const.SESSION_USER);
            username = user != null ? user.getUsername() : null;
        }
        String ip = IPUtils.getIpAddr(request);

        SystemLog log = new SystemLog();
        log.setUsername(username);
        log.setModule(module);
        log.setDescription(description);
        log.setIp(ip);
        log.setContent(operateContent(joinPoint, methodName, ip, request));

        super.insert(log);
    }

    public String operateContent(ProceedingJoinPoint joinPoint, String methodName, String ip, HttpServletRequest request) {
        String className = joinPoint.getTarget().getClass().getName();
        Object[] params = joinPoint.getArgs();
        StringBuffer bf = new StringBuffer();
        if (params != null && params.length > 0) {
            Enumeration<String> paraNames = request.getParameterNames();
            while (paraNames.hasMoreElements()) {
                String key = paraNames.nextElement();
                bf.append(key).append("=");
                bf.append(request.getParameter(key)).append("&");
            }
            if (StringUtils.isBlank(bf.toString())) {
                bf.append(request.getQueryString());
            }
        }
        return String.format(LOG_CONTENT, className, methodName, bf.toString(), ip);
    }

    @Override
    public Page<SystemLogResponse> getPage(Page<SystemLog> page, SystemLogRequest request) {
        List<SystemLog> logs = baseMapper.findSystemLog(page, request);
        page.setRecords(logs);
        return convert(page, SystemLogResponse.class);
    }
}
