package com.ogan.demo._01面向对象;

import java.util.List;

/**
 * @author xlm
 * @time 2020/10/12 11:18
 */
public class TomCat {
    private String name;

    public TomCat() {
        this.name = "default";
    }

    public TomCat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shout(List<Mouse> mouseList) {
        System.out.println("大家好我是猫咪：" + this.name);
        for (Mouse mouse : mouseList) {
            mouse.run(this);
        }
    }
}
