package FacadePattern;

import java.math.BigDecimal;

public class Investment implements IAccount{
    BigDecimal amount = null;

    public Investment(BigDecimal initAmmount) {
        amount = initAmmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
