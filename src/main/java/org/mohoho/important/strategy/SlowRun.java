package org.mohoho.important.strategy;

/**
 * @author qmruan
 * @date 2023/6/9 15:47
 */
public class SlowRun implements IRunBehavior{
    @Override
    public void run() {
        System.out.println("SlowRun");
    }
}
