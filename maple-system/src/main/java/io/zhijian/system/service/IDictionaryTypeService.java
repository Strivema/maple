package io.zhijian.system.service;

import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.DictionaryType;
import io.zhijian.system.model.request.DictionaryTypeRequest;
import io.zhijian.system.model.response.DictionaryTypeResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * DictionaryType Service接口
 * @create 2017-4-3 17:45:00
 */
public interface IDictionaryTypeService extends IBaseService<DictionaryType> {

    @Transactional
    public DictionaryTypeResponse save(DictionaryTypeRequest request);

    @Transactional
    public DictionaryTypeResponse update(DictionaryTypeRequest request);

    @Transactional
    public Integer del(Long id);

    public DictionaryTypeResponse get(Long id);

    public List<DictionaryTypeResponse> getDictionaryTypes();

}
