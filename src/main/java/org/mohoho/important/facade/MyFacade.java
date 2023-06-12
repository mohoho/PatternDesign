package org.mohoho.important.facade;

/**
 * @author qmruan
 * @date 2023/6/9 17:51
 */
public class MyFacade {

    private Elephant elephant;
    private IceBox iceBox;

    public MyFacade(Elephant elephant, IceBox iceBox){
        this.elephant = elephant;
        this.iceBox = iceBox;
    }

    public void toBox(){
        iceBox.turnOn();
        elephant.goIn();
        iceBox.turnOff();
    }

    public void outBox(){
        iceBox.turnOn();
        elephant.goOut();
        iceBox.turnOff();
    }
}
