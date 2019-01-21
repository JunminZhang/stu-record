package com.zjm.sturecord.thread;

import java.util.concurrent.TimeUnit;

/**
 *  模拟线程可见性问题
 */
public class VisableDemo {

    //private static boolean stop=false;

    //添加volatile关键字使得 stop变量突破内存屏障，对所有线程可见
    private volatile static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            int i=0;
            while(!stop){
                i++;
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        stop=true;
    }
}
