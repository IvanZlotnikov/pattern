package pattern.chainOfResponsibility.chain3;

public class MinLimit extends ValidateTransaction {
    @Override
    public void check(MoneyTransaction moneyTransaction) {
        if (moneyTransaction.getAmount() > 1_000) {
            System.out.println("Необходимо ввести пин-код");
        }
        checkNext(moneyTransaction);
    }
}
