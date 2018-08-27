package com.lanif.lesson36.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

@Component
public class Task {
    public static Random random = new Random();

    @Async
    public Future doTaskOne() throws InterruptedException {
        System.out.println("start task 1");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("end task 1, time: " + (end - start) + " millis");
        return new AsyncResult("task 1 complete");
    }

    @Async
    public Future doTaskTwo() throws InterruptedException {
        System.out.println("start task 2");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("end task 2, time: " + (end - start) + " millis");
        return new AsyncResult("task 2 complete");
    }

    @Async
    public Future doTaskThree() throws InterruptedException {
        System.out.println("start task 3");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("end task 3, time: " + (end - start) + " millis");
        return new AsyncResult("task 3 complete");
    }
}
