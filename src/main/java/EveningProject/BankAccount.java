package EveningProject;

public class BankAccount  {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double amount) {
        this.amount += amount;
    }

    public void withdraw(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        }
        else {
            System.out.println("Not enough amount!");
        }
    }
}
