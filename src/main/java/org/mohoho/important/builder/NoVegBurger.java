package org.mohoho.important.builder;

/**
 * @author qmruan
 * @date 2023/6/12 15:18
 */
public class NoVegBurger extends Burger{

    @Override
    public String name() {
        return "NoVegBurger";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}
