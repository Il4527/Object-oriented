package com.ogan.demo._03策略模式;

/**
 * @author xlm
 * @time 2020/10/12 16:11
 */
public class TollReturn extends TollBase {

    @Override
    public void tollAlgorithm() {
        System.out.println("返利收费");
    }
}
