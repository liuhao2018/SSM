package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuhao
 */
@RestController(value = "/users")
public class UserController {

    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    @RequestMapping(method = {RequestMethod.GET})
    public List<User> users() {
        List<User> users = userService.list();
        System.out.println(users);
        return users;
    }
}
