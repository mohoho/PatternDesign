package org.mohoho.normal.command;

/**
 * @author qmruan
 * @date 2023/6/9 16:42
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("do nothing");
    }
}
