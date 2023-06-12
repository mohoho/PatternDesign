package org.mohoho.normal.state;

/**
 * @author qmruan
 * @date 2023/6/12 10:25
 */
public interface ProcessState {

    void toPending();

    void toReady();

    void toRun();
}
