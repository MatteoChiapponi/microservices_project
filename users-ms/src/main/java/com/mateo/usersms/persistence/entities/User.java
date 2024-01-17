package com.mateo.usersms.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String identificationCard;
    private String email;
    private String phoneNumber;
    private String password;
    private String cvu;
    private String alias;
}
