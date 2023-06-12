package org.mohoho.normal.bridge;

/**
 * @author qmruan
 * @date 2023/6/12 17:21
 */
public class Circle extends Shape{

    float radius, x, y;

    public Circle(DrawApi drawApi, float radius, float x, float y){
        super(drawApi);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
