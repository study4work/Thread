package com.lysenko.thread;
import java.util.concurrent.Semaphore;

public class Foo {

       private Semaphore s1 = new Semaphore(1);
       private Semaphore s2 = new Semaphore(0);
       private Semaphore s3 = new Semaphore(0);


    public void first(Runnable r) throws InterruptedException {
            s1.acquire();
                r.run();
                System.out.println(Thread.currentThread() + "first");
            s2.release();

    }

    public void second(Runnable r) throws InterruptedException {
            s2.acquire();
            r.run();
            System.out.println(Thread.currentThread() + "second");
            s3.release();
    }

    public void third(Runnable r) throws InterruptedException {
            s3.acquire();
            r.run();
            System.out.println(Thread.currentThread() + "third");
            s1.release();
    }
}
