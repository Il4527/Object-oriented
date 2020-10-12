package com.ogan.demo._02简单工程模式;

/**
 * @author xlm
 * @time 2020/10/12 11:42
 */
public class OperationSub extends Operation {



    @Override
    public double getResult() {
        return this.numberA - this.numberB;
    }
}
