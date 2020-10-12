package com.ogan.demo._03策略模式;

import java.util.Scanner;

/**
 * 策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，
 * 只是实现不同，它可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合
 * @author xlm
 * @time 2020/10/12 15:58
 */
public class CoreMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入收费策略:1.正常收费 2.折扣收费 3.返利收费");
        try {
            int type = scanner.nextInt();
            TollBase toll = TollFactory.createToll(type);

            TollContext tollContext = new TollContext(toll);
            tollContext.calc();
        } catch (Exception e) {
            System.out.println("收费策略出现异常：" + e.getMessage());
        }
    }
}
