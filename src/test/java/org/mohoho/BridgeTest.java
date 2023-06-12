package org.mohoho;

import org.junit.Test;
import org.mohoho.normal.bridge.Circle;
import org.mohoho.normal.bridge.GreenCircle;
import org.mohoho.normal.bridge.RedCircle;

/**
 * @author qmruan
 * @date 2023/6/12 17:26
 */
public class BridgeTest {
    @Test
    public void test1() {
        Circle circle1 = new Circle(new GreenCircle(), 1f, 1f, 1f);
        circle1.draw();

        Circle circle2 = new Circle(new RedCircle(), 2f, 2f, 2f);
        circle2.draw();
    }
}
