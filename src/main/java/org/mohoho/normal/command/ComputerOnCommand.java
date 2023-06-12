package org.mohoho.normal.command;

/**
 * @author qmruan
 * @date 2023/6/9 16:32
 */
public class ComputerOnCommand implements Command {

    Computer computer;

    public ComputerOnCommand(Computer computer){
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}
