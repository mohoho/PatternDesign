package org.mohoho.normal.decorator;

/**
 * @author qmruan
 * @date 2023/6/9 17:32
 */
public class GreenGemDecorator implements IEquipDecorator{

    IEquip iEquip;

    public GreenGemDecorator(IEquip iEquip){
        this.iEquip = iEquip;
    }

    @Override
    public String Description() {
        return iEquip.Description() + "绿宝石";
    }

    @Override
    public int Attack() {
        return 50 + iEquip.Attack();
    }
}
