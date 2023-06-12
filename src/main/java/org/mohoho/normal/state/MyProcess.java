package org.mohoho.normal.state;

/**
 * @author qmruan
 * @date 2023/6/12 10:29
 */
public class MyProcess {

    private ProcessState pendingProcessState;
    private ProcessState runProcessState;
    private ProcessState readyProcessState;

    public ProcessState currentState;

    public MyProcess(){
        this.pendingProcessState = new PendingProcessState(this);
        this.runProcessState = new RunProcessState(this);
        this.readyProcessState = new ReadyProcessState(this);

        this.currentState = readyProcessState;
    }

    public void toPending(){
        currentState.toPending();
    }

    public void toRun(){
        currentState.toRun();
    }

    public void toReady(){
        currentState.toReady();
    }

    public void setPendingProcessState() {
        currentState = pendingProcessState;
    }

    public void setRunProcessState() {
        currentState = runProcessState;
    }

    public void setReadyProcessState() {
        currentState = readyProcessState;
    }
}
