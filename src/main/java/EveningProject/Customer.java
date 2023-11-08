package EveningProject;

public class Customer implements Runnable {
    private BankAccount bankAccount;

    public Customer(double amount) {
        bankAccount = new BankAccount(amount);
    }

    public double getAmount() {
        return bankAccount.getAmount();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    @Override
    public void run() {
        System.out.println("Customer performing a deposit: " + getAmount());
        bankAccount.deposit(getAmount());
    }


}
