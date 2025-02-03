package pattern.bridge;

public class Byn implements Currency{
    @Override
    public String getCurrencyName() {
        return "Byn";
    }

    @Override
    public double getExchangeRate() {
        return 0.33; // 1usdt = 3 byn
    }
}
