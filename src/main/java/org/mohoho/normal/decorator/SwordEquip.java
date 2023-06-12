package org.mohoho.normal.decorator;

/**
 * @author qmruan
 * @date 2023/6/9 17:25
 */
public class SwordEquip implements IEquip{
    @Override
    public String Description() {
        return "屠龙刀";
    }

    @Override
    public int Attack() {
        return 999;
    }
}
