package org.mohoho.important.template;

/**
 * @author qmruan
 * @date 2023/6/9 19:18
 */
public class TesterWorker extends Worker {

    public TesterWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "测bug");
    }
}
