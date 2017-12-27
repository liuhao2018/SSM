package com.ssm.service.impl;

import com.ssm.Mapper.UserMapper;
import com.ssm.entity.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liuhao
 */

@Service("userService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {

    @Autowired
    public UserMapper userMapper;


    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
