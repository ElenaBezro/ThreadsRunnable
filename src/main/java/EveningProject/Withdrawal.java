package EveningProject;

public class Withdrawal implements Transaction{
    @Override
    public void process(int balance, int amount, int accountNumber) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Account " + accountNumber + " withdrawn $" + amount + ". New balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount for Account " + accountNumber);
        } else {
            System.out.println("Insufficient funds for withdrawal from Account " + accountNumber);
        }
    }
}
