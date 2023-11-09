package EveningProject;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accountList;

    public Bank() {
        this.accountList = new ArrayList<>();
    }

    public void addBankAccount(BankAccount account) {
        accountList.add(account);
    }
}
