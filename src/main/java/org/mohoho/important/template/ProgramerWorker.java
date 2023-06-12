package org.mohoho.important.template;

/**
 * @author qmruan
 * @date 2023/6/9 19:19
 */
public class ProgramerWorker extends Worker{

    public ProgramerWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "写bug");
    }
}
