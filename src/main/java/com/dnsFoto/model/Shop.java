package com.dnsFoto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by shestakov.m on 16.01.2017.
 */
@Entity
@Table(name = "shop")
public class Shop {
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "city")
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
