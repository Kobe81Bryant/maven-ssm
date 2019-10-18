package com.kobe.juc;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareData{
    private Integer num=0;
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (num!=0){
                condition.await();
            }
            ++num;
            System.out.println("加线程名称"+Thread.currentThread().getName()+" num:"+num);
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }

    public void deincrement() throws InterruptedException {
        lock.lock();
        try {
            while (num==0){
                condition.await();
            }
            --num;
            System.out.println("减线程名称"+Thread.currentThread().getName()+" num:"+num);
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }
}
public class LockDemo1 {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        new Thread(() -> {
            for (int i = 0; i < 3; i++)
                try {
                    shareData.deincrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }, "aaa").start();
        new Thread(() -> {
            for (int i = 0; i < 3; i++)
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }, "bbb").start();
        new Thread(() -> {
            for (int i = 0; i < 3; i++)
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }, "ccc").start();
    }
}
