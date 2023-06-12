package org.mohoho.normal.mediator;

/**
 * @author qmruan
 * @date 2023/6/12 18:58
 */
public class User {

    public String name;

    public void sendMessage(String msg){
        new ChatRoom().showMessage(this, msg);
    }
}
