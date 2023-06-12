package org.mohoho.normal.visitor;

/**
 * @author qmruan
 * @date 2023/6/12 20:08
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
