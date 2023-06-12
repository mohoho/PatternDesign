package org.mohoho.important.observer;

/**
 * @author qmruan
 * @date 2023/6/7 15:44
 */
public class ObserverA implements Observer{

    public void registerObserver(MySubject mySubject){
        mySubject.registerObserver(this);
    }

    @Override
    public void update(MySubject o) {
        if (o instanceof QmSubject){
            System.out.println("ObserverA receive QmSubject: " + ((QmSubject) o).getMsg());
        }

        if (o instanceof TmSubject){
            System.out.println("ObserverA receive TmSubject: " + ((TmSubject) o).getMsg());
        }
    }
}
