package pattern.bridge;

public class SavingAccount extends Account {
    private  double balance;

    public SavingAccount(Currency currency) {
        super(currency);
    }

    @Override
    public String getAccountType() {
        return "This is saving account with " +currency.getCurrencyName();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit " + amount + " to " + currency.getCurrencyName());
    }

    public void printBalance(){
        System.out.println("Balance Saving: " + getBalanceConvertedToUsdt(balance)+" Usdt");
    }


}
