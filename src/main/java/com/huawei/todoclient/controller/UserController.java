package com.huawei.todoclient.controller;

import com.huawei.todoclient.model.JwtRequest;
import com.huawei.todoclient.model.JwtResponse;
import com.huawei.todoclient.model.User;
import com.huawei.todoclient.model.UserRegister;
import com.huawei.todoclient.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author sumutella
 * @time 10:03 AM
 * @since 12/14/2019, Sat
 */
@Controller
public class UserController {

    public static String loggedUserName;
    public static String myToken;

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping({"/user/register", ""})
    public String showRegister(Model model){
        UserRegister userRegister = new UserRegister();
        model.addAttribute("user", userRegister);
        return "user/register";
    }

    @PostMapping({"/user/save"})
    public String showRegister(@ModelAttribute("user") UserRegister user, Model model){
        ResponseEntity<UserRegister> savedUser = userService.saveUser(user);
        System.out.println(savedUser.getBody());
        return "test";
    }

    @GetMapping({"/user/login"})
    public String showLogin(Model model){
        JwtRequest jwtRequest = new JwtRequest();
        model.addAttribute("userLogin", jwtRequest);
        return "user/login";
    }

    @PostMapping({"/user/authenticate"})
    public String showRegister(@ModelAttribute("userLogin") JwtRequest userLogin, Model model){
        myToken = userService.authenticate(userLogin).getBody().getToken();
        loggedUserName = userLogin.getUsername();
        if (myToken!=null && !myToken.isEmpty()){
            System.out.println(userService.findByUsername(userLogin.getUsername()));
        }
        return "test";
    }



}
