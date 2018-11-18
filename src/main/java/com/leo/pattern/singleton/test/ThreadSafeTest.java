package com.leo.pattern.singleton.test;

import com.leo.pattern.singleton.lazy.LazyThree;

import java.util.concurrent.CountDownLatch;

public class ThreadSafeTest {
    public static void main(String[] args) {
        Long star = System.currentTimeMillis();
        int count = 2000000;
        CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
           /* new Thread() {
                @Override
                public void run() {
                    //System.out.println("正在执行:Two " + Thread.currentThread().getName;
                    Object instance = LazyTwo.getInstance();
                    //System.out.println(System.currentTimeMillis() + ":" + instance);

                    latch.countDown();
                }
            }.start();*/
            Object instance = LazyThree.getInstance();
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - star);
//        try {
//            System.out.println("等待子线程执行完毕");
//            latch.await();
//            System.out.println("继续main...");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
