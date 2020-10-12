package com.ogan.demo._03策略模式;

/**
 * @author xlm
 * @time 2020/10/12 16:10
 */
public class TollContext {
    private TollBase tollBase;

    public TollContext(TollBase tollBase){
        this.tollBase = tollBase;
    }

    public void calc(){
        this.tollBase.tollAlgorithm();
    }
}
