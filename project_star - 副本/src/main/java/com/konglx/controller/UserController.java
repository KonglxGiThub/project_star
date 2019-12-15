package com.konglx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.konglx.bean.User;
import com.konglx.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    private UserServiceImpl userServiceImpl;
    
    @RequestMapping(value = "/test")
    public String Index(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userServiceImpl.getUserById(userId);
        model.addAttribute("user",user);
        model.addAttribute("path","/user/main");
         return "User";
    }
    @RequestMapping(value = "/main")
    public String main(HttpServletRequest request, Model model){

        model.addAttribute("path","WEB-INF/jsp/main.jsp");
         return "main";
    }

}