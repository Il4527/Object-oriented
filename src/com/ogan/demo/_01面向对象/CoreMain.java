package com.ogan.demo._01面向对象;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xlm
 * @time 2020/10/12 10:01
 */
public class CoreMain {
    public static void main(String[] args) {
        shout4();
    }

    private static void shout4() {
        Mouse jack = new Mouse("jack");
        Mouse jakr = new Mouse("jakr");

        TomCat tomCat = new TomCat("Tom");
        List<Mouse> mouseList = new ArrayList<>();
        mouseList.add(jack);
        mouseList.add(jakr);

        tomCat.shout(mouseList);
    }

    private static void shout3() {
        DogChange dogChange  = new DogChange();
        dogChange.changeThing("史卢比");

        CatChange catChange = new CatChange();
        catChange.changeThing("叮当猫");
    }

    private static void shout2() {
        Animal cat = new Cat("小黄");
        cat.setShoutNum(12);
        cat.shout();

        Animal dog = new Dog("小黑");
        dog.setShoutNum(5);
        dog.shout();
    }

    private static void shout1(){
        Cat cat = new Cat();
        cat.shout();

        Cat xh = new Cat("小黄");
        xh.setShoutNum(5);
        xh.shout();


        Dog dog = new Dog("小黑");
        dog.setShoutNum(5);
        dog.shout();
    }
}
