package sk.havkymnauky.restaurant.service;

import sk.havkymnauky.restaurant.model.MainMeal;

import java.util.List;

public interface IMainMealService {

    List<MainMeal> getAllMainMeals();
    MainMeal getMealByID(long id);
    void saveMeal(MainMeal newMeal);
    void deleteMeal(long id);
}
