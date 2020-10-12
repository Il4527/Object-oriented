package com.ogan.demo._04单一职责原则;

import java.util.ArrayList;
import java.util.List;

/**
 * 软件设计真正要做的许多内容，就是发现职责并把那些职责相互分离。
 * 能够想到多余一个动机去改变一个类，那么这个类就具有多个职责
 *
 * 设备对比 手机 vs mp3 + 照相机 + 座机
 * 手机拥有的功能包含3个设备，用起来方便，需要同时完成3个设备的操作，不易拓展
 * 多设备职责分明，易维护、易拓展、易复用、灵活多样
 * @author xlm
 * @time 2020/10/12 16:35
 */
public class CoreMain {
    public static void main(String[] args) {
        Person person = new Person(new Phone("apple"));
        person.active();

        List<Device> devices = new ArrayList<>();
        devices.add(new MP3("网易"));
        devices.add(new Camera("佳能"));
        devices.add(new Landline("万和"));

        person = new Person(devices);
        person.active();

    }
}
