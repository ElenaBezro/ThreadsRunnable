package EveningProject;

public class Deposit implements Transaction {
    @Override
    public void process(int balance, int amount, int accountNumber) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Account " + accountNumber + " deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount for Account " + accountNumber);
        }
    }
}
