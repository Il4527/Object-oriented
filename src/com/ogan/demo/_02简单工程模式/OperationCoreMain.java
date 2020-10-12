package com.ogan.demo._02简单工程模式;

import java.util.Scanner;

/**
 * @author xlm
 * @time 2020/10/12 11:43
 */
public class OperationCoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("简易计算器");
        System.out.println("请输入数字A:");
        try {
            double numberA = scanner.nextDouble();
            System.out.println("请输入数字B:");
            double numberB = scanner.nextDouble();

            System.out.println("请输入运算符 + - * /");
            String operate = scanner.next();

            Operation operation = OperationFactory.createOperation(operate);

            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            System.out.println("运算结果:" + operation.getResult());
        } catch (Exception e) {
            System.out.println("运算发生异常：" + e.getMessage());
        }
    }
}
