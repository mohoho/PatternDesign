package org.mohoho.normal.memento;

/**
 * @author qmruan
 * @date 2023/6/12 19:07
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
