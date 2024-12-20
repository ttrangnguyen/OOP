package FacadePattern;

import java.math.BigDecimal;

public interface IAccount {

    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount toAccount, BigDecimal amount);
    public int getAccountNumber();
}

