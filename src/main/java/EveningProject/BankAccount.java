package EveningProject;

class BankAccount {
    private int accountNumber;
    private BankAccountDetails details;
    private BankAccountTransactionProcessing transactionProcessing;

    public int getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.details = new BankAccountDetails(initialBalance);
        this.transactionProcessing = new BankAccountTransactionProcessing();
    }

    public synchronized void deposit(int amount) {
        transactionProcessing.setDepositTransaction();
        transactionProcessing.process(details, amount, accountNumber);
    }

    public synchronized void withdraw(int amount) {
        transactionProcessing.setWithdrawalTransaction();
        transactionProcessing.process(details, amount, accountNumber);
    }

    public synchronized int getBalance() {
        return details.getBalance();
    }

    public void setBalance(int balance) {
        details.setBalance(balance);
    }
}
