package com.mateo.usersms.model;

import com.mateo.usersms.bussiness.services.users.alias.AliasGeneratorService;
import com.mateo.usersms.bussiness.services.users.cvu.CvuGeneratorService;

public class User {
    private String firstName;
    private String lastName;
    private String identificationCard;
    private String email;
    private String phoneNumber;
    private String password;

    public User(String firstName, String lastName, String identificationCard, String email, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationCard = identificationCard;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

}
