package EveningProject;

public class BankAccount  {
    private int accountNumber;
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public synchronized double getAmount() {
        return amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public synchronized void deposit(double amount) {
        this.amount += amount;
    }

    public synchronized void withdraw(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        }
        else {
            System.out.println("Not enough amount!");
        }
    }
}
