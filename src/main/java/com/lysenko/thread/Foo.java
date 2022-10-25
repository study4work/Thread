package com.lysenko.thread;

import java.util.concurrent.CountDownLatch;

public class Foo {
    public void first(Runnable r) {
        System.out.println("first");
    }

    public void second(Runnable r) {
        System.out.println("second");
    }

    public void third(Runnable r) {
        System.out.println("third");
    }

    synchronized void doWork(Runnable r) {
            first(r);
            second(r);
            third(r);

    }
}
