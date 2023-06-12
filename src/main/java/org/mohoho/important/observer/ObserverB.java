package org.mohoho.important.observer;

/**
 * @author qmruan
 * @date 2023/6/7 15:53
 */
public class ObserverB implements Observer{

    public void registerObserver(MySubject mySubject){
        mySubject.registerObserver(this);
    }

    @Override
    public void update(MySubject o) {
        if (o instanceof QmSubject){
            System.out.println("ObserverB receive QmSubject: " + ((QmSubject) o).getMsg());
        }

        if (o instanceof TmSubject){
            System.out.println("ObserverB receive TmSubject: " + ((TmSubject) o).getMsg());
        }
    }
}
