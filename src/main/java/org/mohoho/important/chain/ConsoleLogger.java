package org.mohoho.important.chain;

/**
 * @author qmruan
 * @date 2023/6/12 19:48
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    public void write(String message) {
        System.out.println("Console::" + message);
    }
}
