package com.zjm.sturecord.thread;

import java.util.concurrent.TimeUnit;

/**
 *    优雅终断线程的方式
 */
public class InterruptDemo {

    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println(i);
        },"interruptDemo");
        thread.start();
        //主线程睡眠一秒
        TimeUnit.SECONDS.sleep(1);
        //System.out.println(thread.isInterrupted());
        thread.interrupt(); //设置interrupt标识为true
        System.out.println(thread.isInterrupted());
    }


}
