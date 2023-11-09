package EveningProject;

public class BankAccountTransactionProcessing {
    private Transaction transaction;

    public void setDepositTransaction() {
        if (transaction instanceof Deposit) {
            return;
        }
        this.transaction = new Deposit();
    }
    public void setWithdrawalTransaction() {
        if (transaction instanceof Withdrawal) {
            return;
        }
        this.transaction = new Withdrawal();
    }

    public void process(int balance, int amount, int accountNumber){
        transaction.process(balance, amount, accountNumber);
    }
}
