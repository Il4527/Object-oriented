package com.ogan.demo._01面向对象;

/**
 * @author xlm
 * @time 2020/10/12 11:19
 */
public class Mouse {
    private String name;

    public Mouse() {
        this.name = "default";
    }

    public Mouse(String name) {
        this.name = name;
    }

    public void run(TomCat tomCat) {
        System.out.println(tomCat.getName() + "来了," + this.name + "快跑");
    }
}
