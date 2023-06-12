package org.mohoho.normal.decorator;

/**
 * @author qmruan
 * @date 2023/6/9 17:26
 */
public class ShoesEquip implements IEquip{

    @Override
    public String Description() {
        return "草鞋";
    }

    @Override
    public int Attack() {
        return 2;
    }
}
