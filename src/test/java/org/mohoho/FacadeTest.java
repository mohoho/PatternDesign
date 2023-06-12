package org.mohoho;

import org.junit.Test;
import org.mohoho.important.facade.Elephant;
import org.mohoho.important.facade.IceBox;
import org.mohoho.important.facade.MyFacade;

/**
 * @author qmruan
 * @date 2023/6/9 19:05
 */
public class FacadeTest {
    @Test
    public void test1() {
        MyFacade myFacade = new MyFacade(new Elephant(), new IceBox());

        myFacade.toBox();

        myFacade.outBox();
    }
}
