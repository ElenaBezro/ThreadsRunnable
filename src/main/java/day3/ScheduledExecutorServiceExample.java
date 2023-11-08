package day3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutor.schedule(() -> System.out.println("I'm scheduled!"), 2, TimeUnit.SECONDS);

        scheduledExecutor.scheduleAtFixedRate(() -> System.out.println("Repeating task"), 0, 1 , TimeUnit.SECONDS);
    }
}
