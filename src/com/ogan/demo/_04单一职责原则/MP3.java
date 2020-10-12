package com.ogan.demo._04单一职责原则;

/**
 * @author xlm
 * @time 2020/10/12 16:38
 */
public class MP3 extends Device {

    public MP3(String name) {
        this.brand = name;
    }

    @Override
    public void play() {
        System.out.println(this.brand + "MP3播放音乐");
    }
}
