package org.mohoho.important.chain;

/**
 * @author qmruan
 * @date 2023/6/12 19:36
 */
public abstract class AbstractLogger {

    public static final int ERROR = 1;
    public static final int INFO = 2;
    public static final int DEBUG = 3;

    int level;
    private AbstractLogger nextLogger;

    public AbstractLogger addNext(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void printLog(int level, String message){
        if (this.level <= level){
            write(message);
        }

        if (this.nextLogger != null){
            this.nextLogger.printLog(level, message);
        }
    }

    public abstract void write(String message);
}
