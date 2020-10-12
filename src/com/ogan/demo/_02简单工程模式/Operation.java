package com.ogan.demo._02简单工程模式;

/**
 * @author xlm
 * @time 2020/10/12 11:41
 */
public abstract class Operation {
    protected double numberA;
    protected double numberB;

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double getResult();
}
