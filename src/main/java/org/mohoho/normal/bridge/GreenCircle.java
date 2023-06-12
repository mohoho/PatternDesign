package org.mohoho.normal.bridge;

/**
 * @author qmruan
 * @date 2023/6/12 17:13
 */
public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(float radius, float x, float y) {
        System.out.println("green" + radius + x + y);
    }
}
