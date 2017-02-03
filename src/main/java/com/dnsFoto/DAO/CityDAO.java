package com.dnsFoto.DAO;

import com.dnsFoto.model.City;

import java.util.List;

/**
 * Created by Shestakov.m on 03.02.2017.
 */
public interface CityDAO {
    List<City> getCity();
    boolean addCity(City city);
    boolean removeCity(int id);
}
