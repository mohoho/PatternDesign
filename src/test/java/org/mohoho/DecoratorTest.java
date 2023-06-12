package org.mohoho;

import org.junit.Test;
import org.mohoho.normal.decorator.GreenGemDecorator;
import org.mohoho.normal.decorator.RedGemDecorator;
import org.mohoho.normal.decorator.ShoesEquip;
import org.mohoho.normal.decorator.SwordEquip;

/**
 * @author qmruan
 * @date 2023/6/9 17:35
 */
public class DecoratorTest {
    @Test
    public void test1() {

        ShoesEquip shoesEquip = new ShoesEquip();
        SwordEquip swordEquip = new SwordEquip();

        RedGemDecorator shoes1 = new RedGemDecorator(new GreenGemDecorator(shoesEquip));
        GreenGemDecorator sword1 = new GreenGemDecorator(new GreenGemDecorator(new GreenGemDecorator(swordEquip)));

        System.out.println("shoes1");
        System.out.println(shoes1.Attack());
        System.out.println(shoes1.Description());

        System.out.println("sword1");
        System.out.println(sword1.Attack());
        System.out.println(sword1.Description());
    }
}
