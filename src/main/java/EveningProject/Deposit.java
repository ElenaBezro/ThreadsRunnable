package EveningProject;

public class Deposit implements Depositable {
    @Override
    public void process(BankAccountDetails details, int amount, int accountNumber) {
        if (amount > 0) {
            details.setBalance(details.getBalance() + amount);
            System.out.println("Account " + accountNumber + " deposited $" + amount + ". New balance: $" + details.getBalance());
        } else {
            System.out.println("Invalid deposit amount for Account " + accountNumber);
        }
    }
}
