package EveningProject;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> accountList = new ArrayList<>();

    public void addBankAccount(BankAccount account) {
        accountList.add(account);
    }

    //Modify the Bank class to return a Future object for each
    //transaction, enabling asynchronous processing.
}
