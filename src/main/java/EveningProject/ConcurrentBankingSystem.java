package EveningProject;

public class ConcurrentBankingSystem {

    public static void main(String[] args) {
        //Ex.1
//        Customer customer1 = new Customer(100.0);
//        Customer customer2 = new Customer(150.0);
//        Customer customer3 = new Customer(200.0);
//        Thread thread1 = new Thread(customer1);
//        Thread thread2 = new Thread(customer2);
//        Thread thread3 = new Thread(customer3);
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        System.out.println(customer1.getAmount());
//        System.out.println(customer2.getAmount());
//        System.out.println(customer3.getAmount());

        //Ex.2
        BankAccount account1 = new BankAccount(500.0);

        for (int i = 0; i < 10; i++) {
            Thread thread4 = new Thread(() -> account1.deposit(Math.random() * 1000));
            Thread thread5 = new Thread(() -> account1.withdraw(Math.random() * 1500));
            thread4.start();
            thread5.start();
            System.out.println(account1.getAmount());
        }

        //Ex.3
        Bank bank = new Bank();
        BankAccount account2 = new BankAccount(8000.0);
        BankAccount account3 = new BankAccount(500.0);

        bank.addBankAccount(account1);
        bank.addBankAccount(account2);
        bank.addBankAccount(account3);

    }
}
