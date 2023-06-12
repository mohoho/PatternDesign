package org.mohoho.normal.state;

/**
 * @author qmruan
 * @date 2023/6/12 11:14
 */
public class RunProcessState implements ProcessState{

    MyProcess myProcess;

    public RunProcessState(MyProcess myProcess){
        this.myProcess = myProcess;
    }

    @Override
    public void toPending() {
        System.out.println("挂起成功 run -> pending");
        myProcess.setPendingProcessState();
    }

    @Override
    public void toReady() {
        System.out.println("运行无法就绪 illegal");
    }

    @Override
    public void toRun() {
        System.out.println("勿重复运行 illegal");
    }
}
