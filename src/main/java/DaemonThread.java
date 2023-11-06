public class DaemonThread {
    static class PrintDaemon extends Thread {
        private static final int TICK = 1000;

        public PrintDaemon() {
            setDaemon(true);
        }

        public void run() {
            while (true) {
                try {
                    System.out.println("Background task is running");
                    Thread.sleep(TICK);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    static class GarbageCollector extends Thread {
        private static final int TICK = 1000;

        public GarbageCollector() {
            setDaemon(true);
        }

        public void run() {
            while (true) {
                try {
                    System.out.println("Cleaning up resources");
                    Thread.sleep(TICK);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class MusicPlayer extends Thread {
        private static final int TICK = 1500;

        public MusicPlayer() {
            setDaemon(true);
        }

        public void run() {
            while (true) {
                try {
                    System.out.println("Playing background music");
                    Thread.sleep(TICK);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        //Exc.1
        Thread printDaemon = new PrintDaemon();
        printDaemon.start();

//Exc.2
        try {
            Thread.sleep(3000);
            System.out.println("Main task");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Exc.3
        Thread collector = new GarbageCollector();
        collector.start();

        //Exe 4.
        Thread player = new MusicPlayer();
        player.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
