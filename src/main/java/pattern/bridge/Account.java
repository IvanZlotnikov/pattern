package pattern.bridge;


//type: saving , debit

// currency: usd, rub,byn

//classes without Bridge: SavingAccountUsd,SavingAccountRub,SavingAccountByn,
//                        DebitAccountUsd,DebitAccountRub,DebitAccountByn

public abstract class Account {
    protected Currency currency;

    public Account(Currency currency) {
        this.currency = currency;
    }

    public abstract String getAccountType();

    public double getBalanceConvertedToUsdt(double amount) {
        return amount * currency.getExchangeRate();
    }

}
