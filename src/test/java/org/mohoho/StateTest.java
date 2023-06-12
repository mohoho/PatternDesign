package org.mohoho;

import org.junit.Test;
import org.mohoho.normal.state.MyProcess;

/**
 * @author qmruan
 * @date 2023/6/12 11:19
 */
public class StateTest {

    @Test
    public void test() {
        MyProcess myProcess = new MyProcess();
        myProcess.toPending();
        myProcess.toReady();
        myProcess.toRun();
        myProcess.toPending();
        myProcess.toPending();
        myProcess.toRun();
        myProcess.toPending();
        myProcess.toReady();
    }
}
