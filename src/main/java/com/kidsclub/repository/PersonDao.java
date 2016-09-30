package com.kidsclub.repository;

import com.kidsclub.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person, Long> {

}
