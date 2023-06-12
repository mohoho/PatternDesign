package org.mohoho.important.template;

/**
 * @author qmruan
 * @date 2023/6/9 19:13
 */
public abstract class Worker {

    String name;

    public Worker(String name){
        this.name = name;
    }

    public void goOn(){
        System.out.println(name + "上班");
    }

    public void turnOnComputer(){
        System.out.println(name + "开电脑");
    }

    public abstract void work();

    public void goOff(){
        System.out.println(name + "下班");
    }

    public void turnOffComputer(){
        System.out.println(name + "关电脑");
    }

    public void workOneDay(){
        goOn();
        turnOnComputer();
        work();
        turnOffComputer();
        goOff();
    }
}
