package org.mohoho.important.builder;

/**
 * @author qmruan
 * @date 2023/6/12 15:17
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 1.2f;
    }
}
