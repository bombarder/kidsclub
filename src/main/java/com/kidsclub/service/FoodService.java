package com.kidsclub.service;

import com.kidsclub.model.Food;

import java.util.List;

public interface FoodService {
    List<Food> getAll();
    Food createFood(String name, String description, int price);
}
