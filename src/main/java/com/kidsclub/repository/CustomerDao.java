package com.kidsclub.repository;

import com.kidsclub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<User, Long> {

}
