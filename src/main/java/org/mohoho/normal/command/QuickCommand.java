package org.mohoho.normal.command;

/**
 * @author qmruan
 * @date 2023/6/9 16:49
 */
public class QuickCommand implements Command{

    private Command[] commands = new Command[10];

    public QuickCommand(){
        for (int i = 0; i < commands.length; i++){
            commands[i] = new NoCommand();
        }
    }

    public void setQuickCommand(int index, Command command){
        commands[index] = command;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
