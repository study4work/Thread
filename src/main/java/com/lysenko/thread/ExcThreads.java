package com.lysenko.thread;

import java.util.concurrent.CompletableFuture;

public class ExcThreads {
    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture.runAsync(() -> {
            try {
                foo.second(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture.runAsync(() -> {
            try {
                foo.third(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture.runAsync(() -> {
            try {
                foo.first(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}



