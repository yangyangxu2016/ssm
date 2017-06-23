package com.xuyy.service.impl;

import com.xuyy.pojo.User;
import com.xuyy.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author xyy
 * @create 2017-06-23 16:30
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class UserServiceImplTest {

    static Logger logger = Logger.getLogger(UserServiceImplTest.class);
    //    @Resource
//    private UserMapper userMapper;
    @Resource
    private IUserService userService;


    @Test
    public void test1() {
        // 记录debug级别的信息
        logger.debug("This is debug message.");
        // 记录info级别的信息
        logger.info("This is info message.");
        // 记录error级别的信息
        logger.error("This is error message.");

        User user = userService.getUserById(1);
        System.out.println(user.toString());
    }


}
