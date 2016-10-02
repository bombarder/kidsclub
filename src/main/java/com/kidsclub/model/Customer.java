package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Customer extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;
    private String login;

    public Customer(String firstName, String lastName, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
    }
}
