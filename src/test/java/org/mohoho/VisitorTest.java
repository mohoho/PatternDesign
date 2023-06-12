package org.mohoho;

import org.junit.Test;
import org.mohoho.normal.visitor.Comp;
import org.mohoho.normal.visitor.ComputerPartDisplayVisitor;

/**
 * @author qmruan
 * @date 2023/6/12 20:19
 */
public class VisitorTest {
    @Test
    public void test1() {
        Comp comp = new Comp();
        comp.accept(new ComputerPartDisplayVisitor());
    }
}
