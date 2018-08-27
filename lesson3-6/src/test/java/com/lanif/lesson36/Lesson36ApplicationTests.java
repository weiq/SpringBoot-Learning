package com.lanif.lesson36;

import com.lanif.lesson36.async.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Lesson36ApplicationTests {
    @Autowired
    private Task task;

    @Test
    public void contextLoads() throws InterruptedException {
        Long start = System.currentTimeMillis();

        Future task1 = task.doTaskOne();
        Future task2 = task.doTaskThree();
        Future task3 = task.doTaskThree();

        while (true) {
            if (task1.isDone() && task2.isDone() && task3.isDone()) {
                break;
            }
            Thread.sleep(1000);
        }

        Long end = System.currentTimeMillis();

        System.out.println("all tasks completed, time:" + (end - start) + "millis");
    }
}
