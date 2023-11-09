package EveningProject;

public interface DepositTransaction {
    public void process(BankAccountDetails details, int amount, int accountNumber);
}
