package com.dnsFoto.DAO;

import com.dnsFoto.model.Users;

/**
 * Created by shestakov.m on 17.01.2017.
 */
public interface UsersDAO {

    Users getUser(String name);

    void addUser(Users user);

    boolean refreshUsers(Users user);

}
