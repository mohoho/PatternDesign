package org.mohoho.important.builder;

/**
 * @author qmruan
 * @date 2023/6/12 15:20
 */
public class CokeDrink extends Drink{
    @Override
    public String name() {
        return "CokeDrink";
    }

    @Override
    public float price() {
        return 0.4f;
    }
}
