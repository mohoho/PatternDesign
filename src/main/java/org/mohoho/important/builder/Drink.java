package org.mohoho.important.builder;

/**
 * @author qmruan
 * @date 2023/6/12 15:15
 */
public abstract class Drink implements Item{

    @Override
    public Packing packing(){
        return new Bottle();
    }
}
