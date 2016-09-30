package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.ArrayList;

public class Order extends AbstractPersistable<Long> {

    private Entertainment entertainment;
    private ArrayList<Food> foodList;
    private int price;
    private int itemsQuantity;
    private User buyer;
}
