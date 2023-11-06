import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ThreadsMorning extends Thread {
    static class Thread1 extends Thread {
        public void run() {
            for (int i = 1; i < 11; i++) {
                System.out.println(i);
            }
        }
    }

    static class PrintOdd extends Thread {
        public void run() {
            for (int i = 1; i < 21; i = i + 2) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class PrintEven extends Thread {
        public void run() {
            for (int i = 2; i < 21; i = i + 2) {
                System.out.println(i);
            }
        }
    }

    static class PrintTick extends Thread {
        private static final int TICK = 1000;
        public void run() {
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            while(true) {
                try {
                    Thread.sleep(TICK);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(LocalTime.now().format(timeFormatter));
            }
        }
    }

    static class CountDown extends Thread {
        private static final int TICK = 1000;
        public void run() {
            for (int i = 10; i > 0; i--) {
                try {
                    Thread.sleep(TICK);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        //Exc.1
        Thread thread = new Thread1();
        thread.start();

        //Exc.2
        Thread threadPrintOdd = new PrintOdd();
        threadPrintOdd.start();
        Thread threadPrintEven = new PrintEven();
        threadPrintEven.start();

        //Exc.3
        Thread printTick = new PrintTick();
        printTick.start();

        //Exc.4
        Thread countDown = new CountDown();
        countDown.start();
    }
}
