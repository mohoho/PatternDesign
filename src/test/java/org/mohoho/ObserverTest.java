package org.mohoho;

import org.junit.Assert;
import org.junit.Test;
import org.mohoho.important.observer.ObserverA;
import org.mohoho.important.observer.ObserverB;
import org.mohoho.important.observer.QmSubject;
import org.mohoho.important.observer.TmSubject;

/**
 * @author qmruan
 * @date 2023/6/7 15:56
 */
public class ObserverTest {

    @Test
    public void test1(){
        QmSubject qmSubject = new QmSubject();
        TmSubject tmSubject = new TmSubject();
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        observerA.registerObserver(qmSubject);
        observerA.registerObserver(tmSubject);
        observerB.registerObserver(qmSubject);
        observerB.registerObserver(tmSubject);
        qmSubject.removeObserver(observerA);
        qmSubject.setMsg("aaaa");
        tmSubject.setMsg("bbbb");
        Assert.assertTrue(true);
    }
}
