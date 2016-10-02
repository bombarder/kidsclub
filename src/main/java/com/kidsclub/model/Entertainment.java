package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Entertainment extends AbstractPersistable<Long> {

    private String Name;
    private String Description;
    private int duration;
    private int price;

    public Entertainment(String name, String description, int duration, int price) {
        Name = name;
        Description = description;
        this.duration = duration;
        this.price = price;
    }
}
