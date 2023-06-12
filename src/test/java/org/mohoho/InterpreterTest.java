package org.mohoho;

import org.junit.Test;
import org.mohoho.unimportant.Interpreter.AndExpression;
import org.mohoho.unimportant.Interpreter.Expression;
import org.mohoho.unimportant.Interpreter.OrExpression;
import org.mohoho.unimportant.Interpreter.TerminateExpression;

/**
 * @author qmruan
 * @date 2023/6/12 19:24
 */
public class InterpreterTest {
    public static Expression getMaleExpression(){
        Expression robert = new TerminateExpression("Robert");
        Expression john = new TerminateExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminateExpression("Julie");
        Expression married = new TerminateExpression("Married");
        return new AndExpression(julie, married);
    }

    @Test
    public void test() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }
}
