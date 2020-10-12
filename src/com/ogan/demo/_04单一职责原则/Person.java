package com.ogan.demo._04单一职责原则;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xlm
 * @time 2020/10/12 16:39
 */
public class Person {
    private List<Device> devices = new ArrayList<>();

    public Person(Device device) {
        this.devices.add(device);
    }

    public Person(List<Device> devices) {
        this.devices = devices;
    }

    public void active() {
        for (Device device : this.devices) {
            device.play();
        }
    }
}
