package org.mohoho.normal.command;

/**
 * @author qmruan
 * @date 2023/6/9 16:41
 */
public class Panel {

    private Command[] commands = new Command[6];

    public Panel(){
        for (int i = 0; i< commands.length; i++){
            commands[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command command){
        commands[index] = command;
    }

    public void press(int index){
        commands[index].execute();
    }
}
