package org.mohoho.normal.command;

/**
 * @author qmruan
 * @date 2023/6/9 16:37
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
