package com.lysenko.thread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcThreads {
    public static void main(String[] args) {
        Foo foo = new Foo();

        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.submit(new Runnable() {
                @Override
                public void run() {
                    foo.doWork(this);
                }
            });
        }
        service.shutdown();
    }
}


