package com.kidsclub.repository;

import com.kidsclub.model.Entertainment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntertainmentDao extends JpaRepository<Entertainment, Long> {
}
