package pattern.bridge;

public class DebitAccount extends Account {

    private double balance;

    public DebitAccount(Currency currency) {
        super(currency);
    }

    @Override
    public String getAccountType() {
        return "Debit account with " + currency.getCurrencyName();
    }

    public void withdraw(double amount) {
       if (balance >= amount) {
           balance -= amount;
           System.out.println("Withdraw amount " + amount + " from currency " + currency.getCurrencyName());
       }else {
           System.out.println("Not enough money to withdraw from currency " + currency.getCurrencyName());
       }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit " + amount + " to " + currency.getCurrencyName());
    }

    public void printBalance(){
        System.out.println("Balance Debit: " + getBalanceConvertedToUsdt(balance)+" Usdt");
    }
}
