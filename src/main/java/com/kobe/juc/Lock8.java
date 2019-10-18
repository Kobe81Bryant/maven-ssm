package com.kobe.juc;

import java.util.concurrent.TimeUnit;

class Phone {
    public synchronized void sendEmail() throws InterruptedException {
        System.out.println("sendEmail");
    }

    public synchronized void sendMessage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("sendMessage");
    }

    public void openPhone(){
        System.out.println("openPhone");
    }
}

public class Lock8 {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        new Thread(() -> {
            try {
                phone.sendMessage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"aaa").start();
        Thread.sleep(4000);
        new Thread(() -> {
            try {
                phone.sendEmail();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"bbb").start();
    }

}
