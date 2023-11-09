package EveningProject;

public class BankAccountDepositProcessing {
    private Depositable deposit;

    public void process(BankAccountDetails details, int amount, int accountNumber){
        deposit.process(details, amount, accountNumber);
    }
}
