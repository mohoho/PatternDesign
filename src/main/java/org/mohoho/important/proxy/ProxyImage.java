package org.mohoho.important.proxy;

/**
 * @author qmruan
 * @date 2023/6/12 16:52
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
