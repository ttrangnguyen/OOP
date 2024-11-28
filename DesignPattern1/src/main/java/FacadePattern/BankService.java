package FacadePattern;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    public BankService(){
        this.bankAccounts = new Hashtable<>();
    }

    public int createNewAccount(String type, BigDecimal initAmmount){
        IAccount newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmmount);
                break;
            case "saving":
                newAccount = new Saving(initAmmount);
                break;
            case "investment":
                newAccount = new Investment(initAmmount);
                break;
        }
        if(newAccount != null){
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }
    public void transferMoney(int to, int from, BigDecimal amount){
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }
}
