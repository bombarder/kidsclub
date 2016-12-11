package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Entity;

@Entity
public class Entertainment extends AbstractPersistable<Long> {

    private String name;
    private String description;
    private int duration;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
