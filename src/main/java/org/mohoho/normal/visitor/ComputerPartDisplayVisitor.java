package org.mohoho.normal.visitor;

/**
 * @author qmruan
 * @date 2023/6/12 20:17
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Mouse mouse) {
        System.out.println("mouse:" + mouse);
    }

    @Override
    public void visit(KeyBoard keyBoard) {
        System.out.println("keyboard:" + keyBoard);
    }

    @Override
    public void visit(Comp comp) {
        System.out.println("comp:" + comp);
    }
}
