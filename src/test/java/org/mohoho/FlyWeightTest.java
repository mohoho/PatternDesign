package org.mohoho;

import org.junit.Test;
import org.mohoho.unimportant.flyweight.Circle;
import org.mohoho.unimportant.flyweight.ShapeFactory;

/**
 * @author qmruan
 * @date 2023/6/12 16:36
 */
public class FlyWeightTest {
    @Test
    public void test1() {
        Circle blue = ShapeFactory.getCircleByColor("blue");
        blue.setX(1);
        blue.setY(1);
        blue.setRadius(1);
        blue.draw();

        Circle blue2 = ShapeFactory.getCircleByColor("blue");
        blue2.setX(2);
        blue2.setY(2);
        blue2.setRadius(2);
        blue2.draw();
    }
}
