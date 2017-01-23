package com.dnsFoto.service.implement;

import com.dnsFoto.DAO.UsersDAO;
import com.dnsFoto.DAO.UsersDAOImpl;
import com.dnsFoto.model.City;
import com.dnsFoto.model.Users;
import com.dnsFoto.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by shestakov.m on 17.01.2017.
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAOImpl usersDAOImpl;


    public Users getUsers(String name) {
        return usersDAOImpl.getUser(name);
    }
}
