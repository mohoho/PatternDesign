package org.mohoho;

import org.junit.Test;
import org.mohoho.normal.mediator.User;

/**
 * @author qmruan
 * @date 2023/6/12 19:00
 */
public class MediatorTest {
    @Test
    public void test1() {
        User a = new User();
        a.name = "A";
        User b = new User();
        b.name = "B";
        a.sendMessage("hello B");
        b.sendMessage("hello A");
    }
}
