package org.mohoho.important.chain;

/**
 * @author qmruan
 * @date 2023/6/12 19:45
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(){
        this.level = ERROR;
    }
    @Override
    public void write(String message) {
        System.out.println("Error::" + message);
    }
}
