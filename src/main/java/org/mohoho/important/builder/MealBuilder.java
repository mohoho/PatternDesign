package org.mohoho.important.builder;

/**
 * @author qmruan
 * @date 2023/6/12 15:26
 */
public class MealBuilder {

    public Meal prepareMeal1(){
        Meal meal = new Meal();
        meal.addMeal(new VegBurger());
        meal.addMeal(new PesiDrink());
        return meal;
    }

    public Meal prepareMeal2(){
        Meal meal = new Meal();
        meal.addMeal(new NoVegBurger());
        meal.addMeal(new CokeDrink());
        return meal;
    }
}
