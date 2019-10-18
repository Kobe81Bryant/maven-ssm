package com.kobe.juc;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareResourse{
    private int flag=1;
    private Lock lock=new ReentrantLock();
    private Condition c1=lock.newCondition();
    private Condition c2=lock.newCondition();
    private Condition c3=lock.newCondition();

    public void print5(int loop) throws InterruptedException {
        lock.lock();
        try {
            while (flag!=1){
                c1.await();
            }
            for (int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"第"+loop+"次循环");
            }
            flag=2;
            c2.signal();
        }finally {
            lock.unlock();
        }
    }

    public void print10(int loop) throws InterruptedException {
        lock.lock();
        try {
            while (flag!=2){
                c2.await();
            }
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"第"+loop+"次循环");
            }
            flag=3;
            c3.signal();
        }finally {
            lock.unlock();
        }
    }

    public void print15(int loop) throws InterruptedException {
        lock.lock();
        try {
            while (flag!=3){
                c3.await();
            }
            for (int i=0;i<15;i++){
                System.out.println(Thread.currentThread().getName()+"第"+loop+"次循环");
            }
            flag=1;
            c1.signal();
        }finally {
            lock.unlock();
        }
    }
}

public class LockDemo2 {
    public static void main(String[] args) {
        ShareResourse sr=new ShareResourse();

        new Thread(()->{
            for (int i=0;i<10;i++){
                try {
                    sr.print5(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"aaa").start();

        new Thread(()->{
            for (int i=0;i<10;i++){
                try {
                    sr.print10(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"bbb").start();

        new Thread(()->{
            for (int i=0;i<10;i++){
                try {
                    sr.print15(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"ccc").start();
    }
}
