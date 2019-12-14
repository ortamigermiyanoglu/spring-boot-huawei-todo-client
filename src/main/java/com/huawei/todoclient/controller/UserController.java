package com.huawei.todoclient.controller;

import com.huawei.todoclient.model.UserRegister;
import com.huawei.todoclient.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sumutella
 * @time 10:03 AM
 * @since 12/14/2019, Sat
 */
@Controller
@RequestMapping({"user/"})
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"register"})
    public String showRegister(Model model){
        UserRegister userRegister = new UserRegister();
        model.addAttribute("user", userRegister);
        return "user/register";
    }

    @PostMapping({"save"})
    public String showRegister(@ModelAttribute("user") UserRegister user, Model model){
        ResponseEntity<UserRegister> savedUser = userService.saveUser(user);
        System.out.println(savedUser.getBody());
        return "user/test";
    }


}
