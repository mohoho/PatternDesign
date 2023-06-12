package org.mohoho;

import org.junit.Test;
import org.mohoho.important.adapter.V220power;
import org.mohoho.important.adapter.V5power;
import org.mohoho.important.adapter.V5powerAdapter;

/**
 * @author qmruan
 * @date 2023/6/9 16:12
 */
public class AdapterTest {
    @Test
    public void mobile() {
        V5power v5power = new V5powerAdapter(new V220power());
        System.out.println(v5power.productV5power());
    }
}
