package com.zjm.sturecord.thread;

/**
 * Create by zjm on 2019/1/31
 *  通过volatile关键字来保证数据的可见性
 */
public class VolatileDemo {

    private static VolatileDemo instance = null;

    public static void main(String[] args) {
        VolatileDemo.getInstance();
    }

    public static VolatileDemo getInstance() {
        if (instance == null) {
            instance = new VolatileDemo();
        }
        return instance;
    }
}
