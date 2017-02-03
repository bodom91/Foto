package com.dnsFoto.DAO;

import com.dnsFoto.model.City;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shestakov.m on 03.02.2017.
 */
@Service
public class CityDAOImpl implements CityDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<City> getCity() {
        return sessionFactory.getCurrentSession().createQuery("from City").list();
    }

    public boolean addCity(City city) {
        sessionFactory.getCurrentSession().save(city);
        return true;
    }

    public boolean removeCity(int id) {
        City city = (City) sessionFactory.getCurrentSession().load(City.class, id);
        if (city != null) {
            sessionFactory.getCurrentSession().delete(city);
            return true;
        } else return false;
    }
}
