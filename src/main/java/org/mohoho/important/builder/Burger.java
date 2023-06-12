package org.mohoho.important.builder;

/**
 * @author qmruan
 * @date 2023/6/12 15:06
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wrapper();
    }
}
