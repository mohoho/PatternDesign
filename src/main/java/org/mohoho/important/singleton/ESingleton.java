package org.mohoho.important.singleton;

/**
 * @author qmruan
 * @date 2023/6/9 14:45
 */
public class ESingleton {
    private static ESingleton eSingleton = null;

    static {
        eSingleton = new ESingleton();
    }
    private ESingleton(){};

    public static ESingleton getInstance(){
        return eSingleton;
    }
}
