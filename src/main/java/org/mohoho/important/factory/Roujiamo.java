package org.mohoho.important.factory;

/**
 * @author qmruan
 * @date 2023/6/9 14:13
 */
public abstract class Roujiamo {

    protected String name;

    public void prepare(){
        System.out.println("prepare:" + name);
    }

    public void pack(){
        System.out.println("pack:" + name);
    }

    public void cook(){
        System.out.println("cook:" + name);
    }
}
