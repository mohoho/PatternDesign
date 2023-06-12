package org.mohoho;

import org.junit.Test;
import org.mohoho.important.builder.Meal;
import org.mohoho.important.builder.MealBuilder;

/**
 * @author qmruan
 * @date 2023/6/12 15:31
 */
public class BuilderTest {

    @Test
    public void test() {

        MealBuilder mealBuilder1 = new MealBuilder();
        Meal meal1 = mealBuilder1.prepareMeal1();
        meal1.showList();
        meal1.showPacking();
        meal1.calculatePrice();

        Meal meal2 = mealBuilder1.prepareMeal2();
        meal2.showList();
        meal2.showPacking();
        meal2.calculatePrice();

    }
}
