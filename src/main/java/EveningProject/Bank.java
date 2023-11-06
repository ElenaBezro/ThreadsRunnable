package EveningProject;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> accountList = new ArrayList<>();

    public void addBankAccount(BankAccount account) {
        accountList.add(account);
    }
}
