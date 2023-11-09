package EveningProject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    private List<BankAccount> accountList;
    private ExecutorService executor;

    public Bank() {
        this.accountList = new ArrayList<>();
        this.executor = Executors.newFixedThreadPool(5);
    }

    public void addBankAccount(BankAccount account) {
        accountList.add(account);
    }

    //Modify the Bank class to return a Future object for each
    //transaction, enabling asynchronous processing.
}
