package org.mohoho.normal.state;

/**
 * @author qmruan
 * @date 2023/6/12 10:30
 */
public class PendingProcessState implements ProcessState {

    MyProcess myProcess;

    public PendingProcessState(MyProcess myProcess){
        this.myProcess = myProcess;
    }

    @Override
    public void toPending() {
        System.out.println("勿重复挂起 illegal");
    }

    @Override
    public void toReady() {
        System.out.println("进程pending -> ready");
        myProcess.setReadyProcessState();
    }

    @Override
    public void toRun() {
        System.out.println("进程pending -> run");
        myProcess.setRunProcessState();
    }
}
