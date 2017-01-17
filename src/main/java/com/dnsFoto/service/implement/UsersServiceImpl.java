package com.dnsFoto.service.implement;

import com.dnsFoto.DAO.UsersDAO;
import com.dnsFoto.model.Users;
import com.dnsFoto.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shestakov.m on 17.01.2017.
 */
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDAO usersDAO;

    public Users getUser(String name) {
        return usersDAO.getOne(name);
    }

    public Users AddUsers(Users user) {
        Users users = usersDAO.saveAndFlush(user);
        return users;
    }

    public void deleteUsers(String name) {
        usersDAO.delete(name);
    }

    public Users editUsers(Users user) {
        return usersDAO.saveAndFlush(user);
    }
}
