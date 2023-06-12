package org.mohoho.normal.mediator;

/**
 * @author qmruan
 * @date 2023/6/12 18:55
 */
public class ChatRoom {

    public void showMessage(User user, String message){
        System.out.println(user.name + " " + message);
    }
}
