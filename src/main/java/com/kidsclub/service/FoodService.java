package com.kidsclub.service;

import com.kidsclub.model.Food;
import java.util.List;

public interface FoodService {
    Food save(Food food);

    List<Food> findAll();

    Food findOne(long id);
}
