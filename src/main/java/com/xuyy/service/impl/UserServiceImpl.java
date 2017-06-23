package com.xuyy.service.impl;

import com.xuyy.dao.UserMapper;
import com.xuyy.pojo.User;
import com.xuyy.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xyy
 * @create 2017-04-13 17:39
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;



    @Override
    public User getUserById(int userId) {
        System.out.println("getUserById");
        System.out.println(userMapper);
        return userMapper.selectByPrimaryKey(userId);

    }
}
