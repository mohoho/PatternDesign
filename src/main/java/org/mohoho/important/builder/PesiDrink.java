package org.mohoho.important.builder;

/**
 * @author qmruan
 * @date 2023/6/12 15:19
 */
public class PesiDrink extends Drink{
    @Override
    public String name() {
        return "PesiDrink";
    }

    @Override
    public float price() {
        return 0.5f;
    }
}
