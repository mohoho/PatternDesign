package org.mohoho;

import org.junit.Assert;
import org.junit.Test;
import org.mohoho.important.singleton.ESingleton;
import org.mohoho.important.singleton.LazySingleton;
import org.mohoho.important.singleton.SafeLazySingleton;

/**
 * @author qmruan
 * @date 2023/6/9 14:47
 */
public class SingletonTest {

    @Test
    public void singletonTest1() {
        // 饿汉式
        ESingleton instance1 = ESingleton.getInstance();
        ESingleton instance2 = ESingleton.getInstance();
        Assert.assertTrue(instance1.equals(instance2));
    }

    @Test
    public void singletonTest2() {
        // 懒汉式 线程不安全
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        Assert.assertTrue(instance1.equals(instance2));

        // 懒汉式 线程安全
        SafeLazySingleton instance3 = SafeLazySingleton.getInstance();
        SafeLazySingleton instance4 = SafeLazySingleton.getInstance();
        Assert.assertTrue(instance3.equals(instance4));
    }
}
