package com.dnsFoto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by shestakov.m on 16.01.2017.
 */
@Entity
@Table(name = "shop")
public class Shop {
    @Column
    private String name;
    @Column
    private int id;

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
}
