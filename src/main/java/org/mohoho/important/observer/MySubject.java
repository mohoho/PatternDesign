package org.mohoho.important.observer;

/**
 * @author qmruan
 * @date 2023/6/7 15:31
 */
public interface MySubject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
