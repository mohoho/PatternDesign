package org.mohoho.normal.visitor;


/**
 * @author qmruan
 * @date 2023/6/12 20:04
 */
public interface ComputerPartVisitor {
    void visit(Mouse mouse);
    void visit(KeyBoard keyBoard);
    void visit(Comp comp);
}
