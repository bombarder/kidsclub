package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Registaration extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;
    private String eMail;
    private int telephoneNumber;
    private String login;
    private String password;

}
