package org.mohoho.unimportant.Interpreter;

/**
 * @author qmruan
 * @date 2023/6/12 19:17
 */
public class TerminateExpression implements Expression {

    private String data;

    public TerminateExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}
