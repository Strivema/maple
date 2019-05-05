package io.zhijian.system.service;

import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.Resource;
import io.zhijian.system.model.request.ResourceRequest;
import io.zhijian.system.model.response.ResourceResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Resource Service接口
 * @create 2017-3-28 10:45:58
 */
public interface IResourceService extends IBaseService<Resource> {

    @Transactional
    public ResourceResponse save(ResourceRequest request);

    @Transactional
    public ResourceResponse update(ResourceRequest request);

    @Transactional
    public Integer del(Long id);

    public ResourceResponse get(Long id);

    public List<ResourceResponse> getResources();

    public List<ResourceResponse> getResources(String roleCode);

    public List<ResourceResponse> getResources(Long parentId, String type);

    public List<ResourceResponse> getResourceByUsername(String username, String type);
}
