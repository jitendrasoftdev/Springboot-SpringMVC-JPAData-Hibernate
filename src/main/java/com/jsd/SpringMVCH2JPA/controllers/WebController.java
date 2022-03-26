/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.jsd.SpringMVCH2JPA.controllers;

import com.jsd.SpringMVCH2JPA.dao.UserRepository;
import com.jsd.SpringMVCH2JPA.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JSD
 */
@Controller
public class WebController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @Autowired
    UserRepository repo;

    @RequestMapping("/registration")
    public String registration(UserInfo info) {
        return "registration";
    }

    @RequestMapping("/register")
    public String registerPerform(UserInfo info) {
        if (!repo.save(info).equals(info)) {
            return "/registration";
        }
        return "/operation";
    }

    @RequestMapping("/operation")
    public String operationPerform() {
        return "operation";
    }

    @RequestMapping("/performOperation")
    public ModelAndView performOperation(@RequestParam("uid") Long id, @RequestParam("operation") String operation) {
        if (operation.equalsIgnoreCase("select")) {
            UserInfo info = repo.findById(id).orElse(new UserInfo());
            return new ModelAndView("/operation", "UserInfo", info);
        } else if (operation.equalsIgnoreCase("delete")) {
            repo.deleteById(id);
            return new ModelAndView("/operation", "UserInfo", new UserInfo());
        } else if (operation.equalsIgnoreCase("update")) {
            UserInfo info = repo.findById(id).orElse(new UserInfo());
            info.setUsername("Updated username");
            repo.save(info);
            return new ModelAndView("/operation", "UserInfo", info);
        } else {
            System.out.println(repo.findByUserName("abc"));
            System.out.println(repo.findByEmail("def@gmail.Com"));
            
        }
        return new ModelAndView();
    }

}
