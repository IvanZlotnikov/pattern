package pattern.chainOfResponsibility.chain3;

public class Main {
    public static void main(String[] args) {
        ValidateTransaction first = new MinLimit();
        ValidateTransaction second = new MaxLimit();

        first.setNext(second);


//        first.check(new MoneyTransaction(5_000));
        first.check(new MoneyTransaction(12_000));
    }
}
