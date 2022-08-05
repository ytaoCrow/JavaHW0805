package com.example.class2.service;

import com.example.class2.dao.Meal;
import java.util.List;


public class MealHelper {

    List<Meal> mealList;

    public MealHelper(List<Meal> mealList){
        this.mealList = mealList;
        mealList.add(new Meal("salmon", 3000, "seaFood 感恩seaFood、讚嘆seaFood"));
    }
    public List<Meal> getMealList() {
        return this.mealList;
    }
}
