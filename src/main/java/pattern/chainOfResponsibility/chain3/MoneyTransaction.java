package pattern.chainOfResponsibility.chain3;

public class MoneyTransaction {
    public MoneyTransaction(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    private double amount;
}
