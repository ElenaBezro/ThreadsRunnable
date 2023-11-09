package EveningProject;

public class BankAccountDetails {
    private int balance;

    public BankAccountDetails(int balance) {
        this.balance = balance;

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized int getBalance() {
        return balance;
    }
}
