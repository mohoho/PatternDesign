package org.mohoho;

import org.junit.Test;
import org.mohoho.important.factory.RoujiaMoFactory;
import org.mohoho.important.factory.Roujiamo;

/**
 * @author qmruan
 * @date 2023/6/9 14:27
 */
public class FactoryTest {

    @Test
    public void roujiaMoSeller(){
        RoujiaMoFactory roujiaMoFactory = new RoujiaMoFactory();
        Roujiamo la = roujiaMoFactory.createRoujiamo("La");
        la.prepare();
        la.pack();
        la.cook();
        Roujiamo suan = roujiaMoFactory.createRoujiamo("Suan");
        suan.prepare();
        suan.pack();
        suan.cook();
    }

}
