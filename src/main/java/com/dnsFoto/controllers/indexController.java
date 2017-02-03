package com.dnsFoto.controllers;

import com.dnsFoto.DAO.CityDAO;
import com.dnsFoto.DAO.UsersDAO;
import com.dnsFoto.model.City;
import com.dnsFoto.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shestakov.m on 10.01.2017.
 */
@Controller
public class indexController {

    @Resource
    private CityDAO usersService;

    @Resource
    private UsersDAO usersDAO;

    @RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
    public ModelAndView printUser() {
        List<City> city = usersService.getCity();
        ModelAndView model = new ModelAndView();
        model.addObject("city", city.get(0).getName());
        Users user =  usersDAO.getUser("admin3");
        if (user != null) {
            model.addObject("name",user.toString());
        }
        model.setViewName("index");
        return model;
    }

}
