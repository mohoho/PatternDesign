package org.mohoho.important.singleton;

/**
 * @author qmruan
 * @date 2023/6/9 14:50
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
