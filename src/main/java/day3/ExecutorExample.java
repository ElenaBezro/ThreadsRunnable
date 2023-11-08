package day3;

import java.util.concurrent.Executor;

public class ExecutorExample {
    static class Invoker1 implements Executor {
        @Override
        public void execute(Runnable r) {
            r.run();
        }
    }
    public void execute() {
        Executor executor = new Invoker1();
        executor.execute( () -> {
            System.out.println("Hello from Executor!");
        });
    }

    static class Invoker2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from Runnable!");
        }
    }
    public void executeRunnable() {
        Runnable executor = new Invoker2();
        executor.run();
    }

    public static void main(String[] args) {
        ExecutorExample executorExample = new ExecutorExample();
        executorExample.execute();
        executorExample.executeRunnable();
    }
}


