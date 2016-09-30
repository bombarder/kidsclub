package com.kidsclub.repository;

import com.kidsclub.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodDao extends JpaRepository<Food, Long> {

}
