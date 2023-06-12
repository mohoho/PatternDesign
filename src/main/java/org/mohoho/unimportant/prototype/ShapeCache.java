package org.mohoho.unimportant.prototype;

import java.util.Hashtable;

/**
 * @author qmruan
 * @date 2023/6/12 15:53
 */
public class ShapeCache {

    private static Hashtable<String, Shape> hashtable = new Hashtable<>();

    public static Shape getShapeById(String id){
        Shape shape = hashtable.get(id);
        return (Shape) shape.clone();
    }

    public static void loadCache(){
        hashtable.put("1", new Circle());
        hashtable.put("2", new Square());
    }
}
