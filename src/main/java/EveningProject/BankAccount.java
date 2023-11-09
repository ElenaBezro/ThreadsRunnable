package EveningProject;

public class BankAccount  {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public synchronized double getAmount() {
        return amount;
    }

    public synchronized void deposit(double amount) {
        if (amount > 0) {
            this.amount += amount;
        }
        else {
            System.out.println("Invalid deposit amount.");
        }

    }
    public synchronized void withdraw(double amount) {
        if (amount > 0 && this.amount >= amount) {
            this.amount -= amount;
        }
        else {
            System.out.println("Insufficient funds for withdrawal or invalid deposit amount");
        }
    }
}
