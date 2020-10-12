package com.ogan.demo._02简单工程模式;

/**
 * @author xlm
 * @time 2020/10/12 11:41
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        switch (operate) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
        }
        throw new RuntimeException(operate + " 该运算符暂不支持运算");
    }
}
