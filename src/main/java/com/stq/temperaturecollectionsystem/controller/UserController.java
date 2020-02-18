package com.stq.temperaturecollectionsystem.controller;


import com.stq.temperaturecollectionsystem.mapper.UserMapper;
import com.stq.temperaturecollectionsystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user")
    public String queryUserList(Model model) {
        List<User> users = userMapper.queryUserList();
        model.addAttribute("userlist", users);
        return "user";
    }

    @PostMapping("/addUser")
    public String addUser(User user) {
        userMapper.addUser(user);
        return "redirect:/user";
    }

    @GetMapping("/deleteUser/{uid}")
    public String deleteUser(@PathVariable("uid") int uid) {
        System.out.println(uid);
        userMapper.deleteUser(uid);
        return "redirect:/user";
    }
}
