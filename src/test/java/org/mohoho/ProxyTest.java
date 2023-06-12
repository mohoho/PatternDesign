package org.mohoho;

import org.junit.Test;
import org.mohoho.important.proxy.Image;
import org.mohoho.important.proxy.ProxyImage;

/**
 * @author qmruan
 * @date 2023/6/12 16:57
 */
public class ProxyTest {
    @Test
    public void test1() {
        Image image = new ProxyImage("1.jpg");
        image.display();
        image.display();
    }
}
