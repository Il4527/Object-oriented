package com.ogan.demo._04单一职责原则;

/**
 * @author xlm
 * @time 2020/10/12 16:34
 */
public class Phone extends Device {

    public Phone(String name){
        this.brand = name;
    }

    @Override
    public void play() {
        System.out.println(this.brand + "手机拍照");
        System.out.println(this.brand + "手机打电话");
        System.out.println(this.brand + "手机听音乐");
    }
}
