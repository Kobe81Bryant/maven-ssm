package com.kobe.juc;

class shareData {
    private int num = 0;

    public synchronized void increment() throws Exception {
        while (num != 0) {
            this.wait();
        }
        num++;
        System.out.println("线程名称" + Thread.currentThread().getName());
        System.out.println("怎加了" + num);
        this.notifyAll();
    }

    public synchronized void deincrement() throws Exception {
        while (num == 0) {
            this.wait();
        }
        num--;
        System.out.println("线程名称" + Thread.currentThread().getName());
        System.out.println("减少了" + num);
        this.notifyAll();
    }

}

public class NotifyDemo {
    public static void main(String[] args) throws Exception {
        shareData shareData = new shareData();
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
