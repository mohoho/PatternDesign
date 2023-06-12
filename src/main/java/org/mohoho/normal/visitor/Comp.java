package org.mohoho.normal.visitor;

/**
 * @author qmruan
 * @date 2023/6/12 20:13
 */
public class Comp implements ComputerPart{

    ComputerPart[] computerParts;

    public Comp(){
        computerParts = new ComputerPart[]{new KeyBoard(),new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < computerParts.length; i++){
            computerParts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
