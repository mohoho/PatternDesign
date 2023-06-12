package org.mohoho.unimportant.prototype;

/**
 * @author qmruan
 * @date 2023/6/12 15:45
 */
public abstract class Shape implements Cloneable{

    String type;

    public String getType(){
        return type;
    }

    abstract void Draw();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
