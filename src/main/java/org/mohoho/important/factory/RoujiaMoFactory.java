package org.mohoho.important.factory;

/**
 * @author qmruan
 * @date 2023/6/9 14:21
 */
public class RoujiaMoFactory {

    public Roujiamo createRoujiamo(String type){
        switch (type){
            case "La": return new LaRoujiamo();
            case "Suan": return new SuanRoujiamo();
            default: return null;
        }
    }
}
