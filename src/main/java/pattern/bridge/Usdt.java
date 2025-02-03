package pattern.bridge;

public class Usdt implements Currency{
    @Override
    public String getCurrencyName() {
        return "Usdt";
    }

    @Override
    public double getExchangeRate() {
        return 1.0;
    }
}
