package com.kidsclub.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;

@Entity
public class Order extends AbstractPersistable<Long> {


    private Entertainment entertainment;
    private ArrayList<Food> foodList;
    private Customer buyer;

    public Order(Entertainment entertainment, ArrayList<Food> foodList, Customer buyer) {
        this.entertainment = entertainment;
        this.foodList = foodList;
        this.buyer = buyer;
    }
}
