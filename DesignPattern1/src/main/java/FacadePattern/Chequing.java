package FacadePattern;

import java.math.BigDecimal;

public class Chequing implements IAccount{
    BigDecimal amount = null;
    public Chequing(BigDecimal initAmmount) {
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
