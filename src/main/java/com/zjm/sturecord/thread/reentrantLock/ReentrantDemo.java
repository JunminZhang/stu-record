package com.zjm.sturecord.thread.reentrantLock;

/**
 * Create by zjm on 2019/5/22
 */
public class ReentrantDemo {

    public synchronized void demo(){
        System.out.println("begin:demo");
        demo2();
    }
    public void demo2(){
        System.out.println("begin:demo1");
        synchronized (this){
        }
    }
    public static void main(String[] args) {
        ReentrantDemo rd=new ReentrantDemo();
        new Thread(rd::demo).start();
    }
}
