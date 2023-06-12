package org.mohoho.unimportant.Interpreter;

/**
 * @author qmruan
 * @date 2023/6/12 19:23
 */
public class AndExpression implements Expression{

    Expression expression1;
    Expression expression2;

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
