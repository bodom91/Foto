package com.dnsFoto.model;


import javax.persistence.*;
import java.util.List;

/**
 * Created by shestakov.m on 13.01.2017.
 */
@Entity
@Table(name = "user_roles")
public class UserRole {

    @Id
    @Column(name = "user_role_id")
    private int id;

    @Column(name = "username")
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "username", nullable = false)
    private List<Users> users;

    @Column(name = "role")
    private String role;
}
