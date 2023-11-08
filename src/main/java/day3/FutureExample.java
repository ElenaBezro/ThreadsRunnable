package day3;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        int a = 5;
        int b = 10;
        Future<Integer> result = executor.submit(() ->  a + b);
        try {
            Integer futureResult = result.get();
            System.out.println(futureResult);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
