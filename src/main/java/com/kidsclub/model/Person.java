package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Person extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;



}
