package com.kidsclub.service.impl;

import com.kidsclub.model.Food;
import com.kidsclub.repository.FoodDao;
import com.kidsclub.service.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    private FoodDao foodDao;

    public FoodServiceImpl(FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    @Override
    public Food save(Food food) {
        return foodDao.save(food);
    }

    @Override
    public List<Food> findAll() {
        return foodDao.findAll();
    }

    @Override
    public Food findOne(long id) {
        return foodDao.findOne(id);
    }
}
