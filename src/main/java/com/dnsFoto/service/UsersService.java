package com.dnsFoto.service;

import com.dnsFoto.model.Users;

/**
 * Created by shestakov.m on 17.01.2017.
 */
public interface UsersService {
    Users getUser(String name);
    Users AddUsers(Users user);
    void deleteUsers(String name);
    Users editUsers(Users user);
}
