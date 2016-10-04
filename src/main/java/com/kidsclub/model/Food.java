package com.kidsclub.model;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Entity;

@Data
@Entity
public class Food extends AbstractPersistable<Long> {

    private String Name;
    private String Description;
    private int price;


}
