package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Food extends AbstractPersistable<Long> {
    public Food(String name, String description, int price) {
        Name = name;
        Description = description;
        this.price = price;
    }

    private String Name;
    private String Description;
    private int price;
}
