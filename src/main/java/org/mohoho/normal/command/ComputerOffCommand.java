package org.mohoho.normal.command;

/**
 * @author qmruan
 * @date 2023/6/9 16:34
 */
public class ComputerOffCommand implements Command{

    Computer computer;

    public ComputerOffCommand(Computer computer){
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }
}
