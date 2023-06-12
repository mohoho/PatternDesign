package org.mohoho.important.strategy;

/**
 * @author qmruan
 * @date 2023/6/9 15:43
 */
public class SmallAttack implements IAttackBehavior{
    @Override
    public void attack() {
        System.out.println("smallAttack");
    }
}
