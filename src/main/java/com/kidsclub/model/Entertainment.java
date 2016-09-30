package com.kidsclub.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

public class Entertainment extends AbstractPersistable<Long> {

    private String Name;
    private String Description;
    private int duration;
    private int price;

}
