package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.ArrayList;

public class Order extends AbstractPersistable<Long> {

    private Entertainment entertainment;
    private ArrayList<Food> foodList;
    private int itemsQuantity;
    private User buyer;

    public Order(Entertainment entertainment, ArrayList<Food> foodList, int itemsQuantity, User buyer) {
        this.entertainment = entertainment;
        this.foodList = foodList;
        this.itemsQuantity = itemsQuantity;
        this.buyer = buyer;
    }
}
