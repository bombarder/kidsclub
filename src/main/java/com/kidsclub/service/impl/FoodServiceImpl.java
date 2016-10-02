package com.kidsclub.service.impl;

import com.kidsclub.model.Food;
import com.kidsclub.repository.FoodDao;
import com.kidsclub.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodDao foodDao;
    @Override
    public List<Food> getAll() {
        return foodDao.findAll();
    }

    @Override
    public Food createFood(String name, String description, int price) {
        Food food = new Food(name, description, price);
        return food;
    }
}
