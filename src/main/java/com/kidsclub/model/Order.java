package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Order extends AbstractPersistable<Long> {
    private int totalPrice;
    private int itemsQuantity;

}
