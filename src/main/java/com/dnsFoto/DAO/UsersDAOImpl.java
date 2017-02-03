package com.dnsFoto.DAO;

import com.dnsFoto.model.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Shestakov.m on 03.02.2017.
 */
@Service
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Users getUser(String name) {
        Users user = (Users) sessionFactory.getCurrentSession().get(Users.class, name);
        return user;
    }

    public void addUser(Users user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public boolean refreshUsers(Users user) {
        sessionFactory.getCurrentSession().update(user);
        return true;
    }
}
