package org.mohoho.normal.bridge;

/**
 * @author qmruan
 * @date 2023/6/12 17:16
 */
public abstract class Shape {

    DrawApi drawApi;

    public Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
