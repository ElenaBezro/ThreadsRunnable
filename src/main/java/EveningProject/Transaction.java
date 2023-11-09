package EveningProject;

public interface Transaction {
    public void process(BankAccountDetails details, int amount, int accountNumber);
}
