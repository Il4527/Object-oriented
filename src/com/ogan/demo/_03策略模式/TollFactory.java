package com.ogan.demo._03策略模式;

/**
 * @author xlm
 * @time 2020/10/12 16:14
 */
public class TollFactory {

    public static TollBase createToll(int type) {
        TollBase tollBase = null;
        switch (type) {
            case 1:
                tollBase = new TollNormal();
                break;
            case 2:
                tollBase = new TollRebate();
                break;
            case 3:
                tollBase = new TollReturn();
                break;
        }

        return tollBase;
    }
}
