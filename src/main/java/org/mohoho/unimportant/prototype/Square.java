package org.mohoho.unimportant.prototype;

/**
 * @author qmruan
 * @date 2023/6/12 15:51
 */
public class Square extends Shape{

    public Square(){
        type = "Square";
    }

    @Override
    void Draw() {
        System.out.println("Square::Draw");
    }
}
