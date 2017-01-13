package com.dnsFoto.model;


import javax.persistence.*;

/**
 * Created by shestakov.m on 13.01.2017.
 */
@Entity
@Table(name = "user_roles")
public class UserRole {

    @Column(name = "user_role_id")
    private int id;

    @Column(name = "username")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false)
    private Users user;

    @Column(name = "role")
    private String role;
}
