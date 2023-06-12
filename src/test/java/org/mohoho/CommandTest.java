package org.mohoho;

import org.junit.Assert;
import org.junit.Test;
import org.mohoho.normal.command.*;

/**
 * @author qmruan
 * @date 2023/6/9 16:55
 */
public class CommandTest {
    @Test
    public void commandTest() {
        Light light = new Light();
        Computer computer = new Computer();
        Panel panel = new Panel();
        panel.setCommand(0, new ComputerOffCommand(computer));
        panel.setCommand(1, new ComputerOnCommand(computer));
        panel.setCommand(2, new LightOffCommand(light));
        panel.setCommand(3, new LightOnCommand(light));
        QuickCommand quickCommand = new QuickCommand();
        quickCommand.setQuickCommand(0, new ComputerOnCommand(computer));
        quickCommand.setQuickCommand(1, new LightOnCommand(light));
        panel.setCommand(4, quickCommand);

        for (int i = 0; i < 6; i++){
            panel.press(i);
        }

        Assert.assertTrue(true);
    }
}
