package com.kidsclub.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Food extends AbstractPersistable<Long> {


    private String Name;
    private String Description;
    private int price;

    public Food(String name, String description, int price) {
        Name = name;
        Description = description;
        this.price = price;
    }
}
