package com.ogan.demo._01面向对象;

/**
 * @author xlm
 * @time 2020/10/12 10:47
 */
public class DogChange extends Dog implements IChange {


    @Override
    public void changeThing(String thing) {
        super.shout();
        System.out.println("thing:" + thing);
    }
}
