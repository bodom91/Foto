package com.dnsFoto.controllers;

import com.dnsFoto.DAO.UsersDAO;
import com.dnsFoto.service.implement.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by shestakov.m on 10.01.2017.
 */
@Controller
public class indexController {

    @Autowired
    private UsersServiceImpl usersService;

    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public String printUser(ModelMap model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String privacy = auth.getAuthorities().toString(); //get logged in username
        String name = auth.getName();
        //model.addAttribute("city", usersService.getCity(name).getName());
        model.addAttribute("name", name);
        model.addAttribute("privacy", privacy);
        return "index";

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }
        model.setViewName("login");

        return model;

    }
}
