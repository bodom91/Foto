package com.dnsFoto.DAO;

import com.dnsFoto.model.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by shestakov.m on 23.01.2017.
 */
@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Users getUser(String name) {
        return (Users) sessionFactory.getCurrentSession().createQuery("from users where username=?");
    }

    public void addUser(Users user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public boolean refreshUsers(Users user) {
        return false;
    }
}
