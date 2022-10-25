package com.lysenko.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcThreads {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Test1 test1 = new Test1();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            service.execute(() -> {
                foo.third(test1);
            });
            service.execute(() -> {
                foo.second(test1);
            });
            service.execute(() -> {
                foo.first(test1);
            });

        }
        service.shutdown();
    }
}



