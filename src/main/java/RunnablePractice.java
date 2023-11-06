import java.lang.reflect.Array;

public class RunnablePractice {

    static class PrintAlphabet implements Runnable {
        @Override
        public void run() {
            String alphabet = "ABCD";
            for (Character character : alphabet.toCharArray()) {
                System.out.println(character);
            }
        }
    }

    static class PrintCooking implements Runnable {
        @Override
        public void run() {
            System.out.println("Cooking");
        }
    }

    static class PrintEating implements Runnable {
        @Override
        public void run() {
            System.out.println("Eating");
        }
    }

    static class CalculateSum implements Runnable {
        int[] array;
        public CalculateSum(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            int sum = 0;
            for(Integer number: array) {
                sum += number;
            }
            System.out.println("Sum: " + sum);
        }
    }


    static class Racer implements Runnable {
        private String name;

        public Racer(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is racing");
        }
    }
    public static void main(String[] args) {
        //Exc.1
        Runnable printAlphabet = new PrintAlphabet();
        Thread thread = new Thread(printAlphabet);
        thread.start();

        //Exc.2
        Runnable printCooking = new PrintCooking();
        Runnable printEating = new PrintEating();
        Thread thread1 = new Thread(printCooking);
        Thread thread2 = new Thread(printEating);
        thread1.start();
        thread2.start();

        //Exc.3
        Runnable sum = new CalculateSum(new int[]{1,2,3,4});
        Thread thread3 = new Thread(sum);
        thread3.start();

        //Exc.4
        String[] names = {"Lena", "Vasya"};
        for(String name: names) {
            Thread thread4 = new Thread(new Racer(name));
            thread4.start();
        }
    }
}
