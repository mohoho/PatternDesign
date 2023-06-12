package org.mohoho.normal.state;

/**
 * @author qmruan
 * @date 2023/6/12 11:09
 */
public class ReadyProcessState implements ProcessState{

    MyProcess myProcess;

    public ReadyProcessState(MyProcess myProcess){
        this.myProcess = myProcess;
    }

    @Override
    public void toPending() {
        System.out.println("就绪不能挂起 illegal");
    }

    @Override
    public void toReady() {
        System.out.println("勿重复就绪 illegal");
    }

    @Override
    public void toRun() {
        System.out.println("开始运行 ready -> run");
        myProcess.setRunProcessState();
    }
}
