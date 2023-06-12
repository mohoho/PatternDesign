package org.mohoho.important.singleton;

/**
 * @author qmruan
 * @date 2023/6/9 14:50
 */
public class SafeLazySingleton {

    private volatile static SafeLazySingleton lazySingleton = null;
    private SafeLazySingleton(){}
    public static SafeLazySingleton getInstance(){
        if (lazySingleton == null) {
            synchronized (SafeLazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new SafeLazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
