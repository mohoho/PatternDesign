package org.mohoho.important.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qmruan
 * @date 2023/6/12 15:21
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addMeal(Item item){
        items.add(item);
    }

    public void showList(){
        for (Item item : items) {
            System.out.println(item.name());
        }
    }

    public void showPacking(){
        for (Item item : items) {
            System.out.println(item.packing().pack());
        }
    }

    public void calculatePrice(){
        float sum = 0f;
        for (Item item : items) {
            sum += item.price();
        }
        System.out.println(sum);
    }
}
