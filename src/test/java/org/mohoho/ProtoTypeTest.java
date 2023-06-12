package org.mohoho;

import org.junit.Test;
import org.mohoho.unimportant.prototype.Shape;
import org.mohoho.unimportant.prototype.ShapeCache;

/**
 * @author qmruan
 * @date 2023/6/12 15:58
 */
public class ProtoTypeTest {
    @Test
    public void test1() {
        ShapeCache.loadCache();
        Shape shape1 = ShapeCache.getShapeById("1");

        System.out.println(shape1.getType());

        Shape shape2 = ShapeCache.getShapeById("2");
        System.out.println(shape2.getType());
    }
}
