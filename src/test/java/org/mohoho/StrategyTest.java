package org.mohoho;

import org.junit.Test;
import org.mohoho.important.strategy.BigAttack;
import org.mohoho.important.strategy.FastRun;
import org.mohoho.important.strategy.RoleA;

/**
 * @author qmruan
 * @date 2023/6/9 15:55
 */
public class StrategyTest {
    @Test
    public void test1() {
        RoleA aaa = new RoleA("AAA");
        aaa.setiRunBehavior(new FastRun()).setiAttackBehavior(new BigAttack());
        aaa.run();
        aaa.attack();
    }
}
