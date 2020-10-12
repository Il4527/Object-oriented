package com.ogan.demo._01面向对象;

/**
 * @author xlm
 * @time 2020/10/12 10:54
 */
public class CatChange extends Cat implements IChange {
    @Override
    public void changeThing(String thing) {
        super.shout();
        System.out.println("thing:" + thing);
    }
}
