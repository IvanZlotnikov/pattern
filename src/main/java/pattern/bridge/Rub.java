package pattern.bridge;

public class Rub implements Currency{
    @Override
    public String getCurrencyName() {
        return "Rub";
    }

    @Override
    public double getExchangeRate() {
        return 0.01; // 1 usdt = 100rub
    }
}
