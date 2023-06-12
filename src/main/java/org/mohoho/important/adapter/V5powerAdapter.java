package org.mohoho.important.adapter;

/**
 * @author qmruan
 * @date 2023/6/9 16:08
 */
public class V5powerAdapter implements V5power {
    V220power v220power;

    public V5powerAdapter(V220power v220power){
        this.v220power = v220power;
    }

    @Override
    public int productV5power() {
        int i = v220power.productV220power();
        return i - 215;
    }
}
