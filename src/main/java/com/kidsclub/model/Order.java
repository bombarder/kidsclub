package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Order extends AbstractPersistable<Long> {

    @ManyToOne()
    private Entertainment entertainment;
    @ManyToOne
    private Food food;
    @ManyToOne
    private Customer customer;

    public Entertainment getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(Entertainment entertainment) {
        this.entertainment = entertainment;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
