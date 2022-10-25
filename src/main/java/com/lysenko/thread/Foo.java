package com.lysenko.thread;

public class Foo {

    volatile int i = 1;

    public synchronized void first(Runnable r) {
        if (i == 1) {
            i = 2;
            r.run();
            System.out.println(Thread.currentThread() + "first");
        }
    }

    public synchronized void second(Runnable r) {
        if (i == 2) {
            i = 3;
            r.run();
            System.out.println(Thread.currentThread() + "second");
        }
    }

    public synchronized void third(Runnable r)  {
        if (i == 3) {
            i = 1;
            r.run();
            System.out.println(Thread.currentThread() + "third");
        }
    }
}
