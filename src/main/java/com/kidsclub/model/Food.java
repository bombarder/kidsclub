package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Food extends AbstractPersistable<Long> {

    private String Name;
    private String Description;
    private int price;
}
