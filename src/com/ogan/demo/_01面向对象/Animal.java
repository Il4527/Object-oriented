package com.ogan.demo._01面向对象;

/**
 * @author xlm
 * @time 2020/10/12 10:27
 */
public abstract class Animal {
    protected String name;
    protected int shoutNum = 1;

    public Animal() {
        this.name = "default";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setShoutNum(int shoutNum) {
        if (shoutNum <= 10) this.shoutNum = shoutNum;
        else this.shoutNum = 10;
    }

    public abstract String getShoutSound();

    public void shout() {
        String shoutText = "";
        for (int i = 0; i < this.shoutNum; i++) {
            shoutText += " " + this.getShoutSound() + " ";
        }
        System.out.println(this.name + shoutText);
    }
}
