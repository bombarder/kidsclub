package com.kidsclub.model;

import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Entity;

@Data
@Entity
public class Customer extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;
    private String login;

}
