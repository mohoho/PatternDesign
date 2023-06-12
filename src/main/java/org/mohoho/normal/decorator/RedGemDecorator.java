package org.mohoho.normal.decorator;

/**
 * @author qmruan
 * @date 2023/6/9 17:29
 */
public class RedGemDecorator implements IEquipDecorator{

    IEquip iEquip;

    public RedGemDecorator(IEquip iEquip){
        this.iEquip = iEquip;
    }

    @Override
    public String Description() {
        return iEquip.Description() + "红宝石";
    }

    @Override
    public int Attack() {
        return 100 + iEquip.Attack();
    }
}
