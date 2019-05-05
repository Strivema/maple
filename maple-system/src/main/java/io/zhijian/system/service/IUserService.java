package io.zhijian.system.service;

import com.baomidou.mybatisplus.plugins.Page;
import io.zhijian.base.service.IBaseService;
import io.zhijian.system.entity.User;
import io.zhijian.system.model.request.UserRequest;
import io.zhijian.system.model.response.UserResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Hao on 2017-03-26.
 */
public interface IUserService extends IBaseService<User> {

    @Transactional
    public UserResponse save(UserRequest request);

    @Transactional
    public UserResponse update(UserRequest request);

    @Transactional
    public Integer del(Long id);

    public UserResponse get(Long id);

    public UserResponse get(String username);

    public User getUser(String username);

    public List<UserResponse> getUsers(UserRequest request);

    public Page<UserResponse> getPage(Page<User> page, UserRequest request);

    public Page<UserResponse> getUsers(Page<User> page, String roleCode);

    public Integer modifyPassword(Long userId, String originalPassword, String newPassword);

    public UserResponse auth(String username, String password);
}
