package com.zjm.sturecord.threadlocal;

/**
 * Create by zjm on 2019/5/7
 */
public class ThreadlocalDemo {

    private static ThreadLocal<Integer> num = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(()->{
                int localVal = num.get().intValue() + 10;
                System.out.println(Thread.currentThread().getName() + "--->" + localVal);
            },"Thread "+i).start();

        }
    }





}
