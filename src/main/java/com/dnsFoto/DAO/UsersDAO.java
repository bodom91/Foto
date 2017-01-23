package com.dnsFoto.DAO;

import com.dnsFoto.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shestakov.m on 17.01.2017.
 */
public interface UsersDAO {

    Users getUser(String name);

    void addUser(Users user);

    boolean refreshUsers(Users user);

}
