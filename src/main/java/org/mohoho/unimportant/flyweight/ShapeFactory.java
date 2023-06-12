package org.mohoho.unimportant.flyweight;

import java.util.HashMap;

/**
 * @author qmruan
 * @date 2023/6/12 16:27
 */
public class ShapeFactory {

    public static final HashMap<String, Shape> map = new HashMap<>();

    public static Circle getCircleByColor(String color){
        Shape shape = map.get(color);
        if (shape == null){
            shape = new Circle(color);
            map.put(color, shape);
        }
        return (Circle)shape;
    }
}
