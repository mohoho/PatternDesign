package org.mohoho.normal.visitor;

/**
 * @author qmruan
 * @date 2023/6/12 20:10
 */
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
