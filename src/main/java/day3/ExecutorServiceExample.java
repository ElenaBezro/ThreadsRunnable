package day3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> {
            System.out.println("ExecutorService in action! Thread: " + Thread.currentThread().getName());
        });
         executor.submit(() -> {
            System.out.println("ExecutorService in action! Thread: " + Thread.currentThread().getName());
        });

        executor.shutdown();




    }
}
