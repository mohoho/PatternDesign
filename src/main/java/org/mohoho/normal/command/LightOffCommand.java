package org.mohoho.normal.command;

/**
 * @author qmruan
 * @date 2023/6/9 16:39
 */
public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
