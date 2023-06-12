package org.mohoho;

import org.junit.Test;
import org.mohoho.important.chain.ConsoleLogger;
import org.mohoho.important.chain.ErrorLogger;

/**
 * @author qmruan
 * @date 2023/6/12 19:52
 */
public class ChainTest {
    @Test
    public void test1() {
        ErrorLogger errorLogger = new ErrorLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger(2);
        consoleLogger.addNext(errorLogger);
        consoleLogger.printLog(3, "level 3");
        consoleLogger.printLog(1, "level 1");
    }
}
