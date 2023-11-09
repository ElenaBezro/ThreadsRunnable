package EveningProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentBankingSystem {

//    public static void main(String[] args) {
//        //Day 3 Ex.1
//        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
//
//        Customer customer1 = new Customer(100.0);
//        Customer customer2 = new Customer(150.0);
//        Customer customer3 = new Customer(200.0);
//
//        List<Customer> customers = new ArrayList<>();
//        customers.add(customer1);
//        customers.add(customer2);
//        customers.add(customer3);
//
//        for (Customer customer : customers) {
//            executorService1.submit(() -> {
//                System.out.println("Customer performing a deposit: " + customer.getAmount());
//                customer.getBankAccount().deposit(customer.getAmount());
//            });
//        }
//
//        System.out.println(customer1.getAmount());
//        System.out.println(customer2.getAmount());
//        System.out.println(customer3.getAmount());
//        executorService1.shutdown();
//
//        //Day 3 Ex.1
//        BankAccount account1 = new BankAccount(500.0);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        for (int i = 0; i < 10; i++) {
//            executorService.submit(() -> account1.deposit(Math.random() * 1000));
//            executorService.submit(() -> account1.withdraw(Math.random() * 1500));
//
//            System.out.println(account1.getAmount());
//        }
//        executorService.shutdown();
//
//        //Ex.3
//        Bank bank = new Bank();
//        BankAccount account2 = new BankAccount(8000.0);
//        BankAccount account3 = new BankAccount(500.0);
//
//        bank.addBankAccount(account1);
//        bank.addBankAccount(account2);
//        bank.addBankAccount(account3);
//    }
}
