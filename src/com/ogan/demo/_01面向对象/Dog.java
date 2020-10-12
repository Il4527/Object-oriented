package com.ogan.demo._01面向对象;

/**
 * @author xlm
 * @time 2020/10/12 10:01
 */
public class Dog extends Animal {

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getShoutSound() {
        return "Dog shout";
    }


}
