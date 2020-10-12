package com.ogan.demo._04单一职责原则;

/**
 * @author xlm
 * @time 2020/10/12 16:47
 */
public class Landline extends Device {

    public Landline(String name) {
        this.brand = name;
    }

    @Override
    public void play() {
        System.out.println(this.brand + "座机打电话");
    }
}
