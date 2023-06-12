package org.mohoho.unimportant.prototype;

/**
 * @author qmruan
 * @date 2023/6/12 15:50
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }

    @Override
    void Draw() {
        System.out.println("Circle::Draw");
    }
}
