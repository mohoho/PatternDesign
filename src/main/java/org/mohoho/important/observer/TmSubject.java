package org.mohoho.important.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qmruan
 * @date 2023/6/7 16:25
 */
public class TmSubject implements MySubject{

    private String msg;

    private List<Observer> observerList = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
