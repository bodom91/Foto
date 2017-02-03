package com.dnsFoto.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;

/**
 * Created by shestakov.m on 16.01.2017.
 */
@Entity
@Table(name = "city")
public class City {
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "id")
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
