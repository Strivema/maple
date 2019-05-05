package io.zhijian.system.service;

import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.Dictionary;
import io.zhijian.system.model.request.DictionaryRequest;
import io.zhijian.system.model.response.DictionaryResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Dictionary Service接口
 * @create 2017-4-3 17:45:00
 */
public interface IDictionaryService extends IBaseService<Dictionary> {

    @Transactional
    public DictionaryResponse save(DictionaryRequest request);

    @Transactional
    public DictionaryResponse update(DictionaryRequest request);

    @Transactional
    public Integer del(Long id);

    public DictionaryResponse get(Long id);

    public List<DictionaryResponse> getDictionarys(String type);

}
