package org.mohoho.important.strategy;

/**
 * @author qmruan
 * @date 2023/6/9 15:34
 */
public abstract class Role {

    String name;
    IRunBehavior iRunBehavior;
    IAttackBehavior iAttackBehavior;

    public void setName(String name) {
        this.name = name;
    }

    public Role setiRunBehavior(IRunBehavior iRunBehavior) {
        this.iRunBehavior = iRunBehavior;
        return this;
    }

    public Role setiAttackBehavior(IAttackBehavior iAttackBehavior) {
        this.iAttackBehavior = iAttackBehavior;
        return this;
    }

    public void run(){
        iRunBehavior.run();
    }

    public void attack(){
        iAttackBehavior.attack();
    }
}
