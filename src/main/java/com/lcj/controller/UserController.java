package com.lcj.controller;

import com.lcj.entity.User;
import com.lcj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser/{id}")
    @ResponseBody
    public User toIndex(@PathVariable  String id){
        User user = userService.getUser(id);
        return user;
    }
}
