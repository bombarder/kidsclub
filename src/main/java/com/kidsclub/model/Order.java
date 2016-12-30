package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Order extends AbstractPersistable<Long> {

    @ManyToOne
    private Customer customer;
    @ManyToMany
    private List<Entertainment> entertainments;
    @ManyToMany
    private List<Food> food;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public List<Food> getFood() {
        return food;
    }

    public void setFood(List<Food> food) {
        this.food = food;
    }

    public List<Entertainment> getEntertainments() {
        return entertainments;
    }

    public void setEntertainments(List<Entertainment> entertainments) {
        this.entertainments = entertainments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
