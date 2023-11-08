package day3;

import java.util.concurrent.Executor;

public class PrintNumbers {
    static class Invoker implements Executor {
        @Override
        public void execute(Runnable r) {
            r.run();
        }
    }
    public void execute() {
        Executor executor = new ExecutorExample.Invoker1();
        executor.execute( () -> {
            for (int i = 1; i < 4; i++) {
                System.out.println(i);
            }
        });
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.execute();
        printNumbers.execute();
    }
}
