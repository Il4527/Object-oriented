package com.ogan.demo._02简单工程模式;

/**
 * @author xlm
 * @time 2020/10/12 11:42
 */
public class OperationDiv extends Operation {



    @Override
    public double getResult() {
        if (this.numberB == 0) {
           throw new RuntimeException("除数不能为0");
        }
        return this.numberA / this.numberB;
    }
}
