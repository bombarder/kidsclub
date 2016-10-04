package com.kidsclub.model;


import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Entity;

@Data
@Entity
public class Order extends AbstractPersistable<Long> {

    private Entertainment entertainment;
    private Food food;
    private Customer buyer;

}
