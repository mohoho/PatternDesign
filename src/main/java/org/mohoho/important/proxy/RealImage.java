package org.mohoho.important.proxy;

/**
 * @author qmruan
 * @date 2023/6/12 16:48
 */
public class RealImage implements Image{

    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("image display " + filename);
    }

    private void loadFromDisk(String filename){
        System.out.println("load from disk " + filename);
    }

}
