package pattern.singleton;

public class Director {

    private static Director INSTANCE;

    private String sign;

    private Director() {
    }

    public static Director getInstance(String sign) {
        if (INSTANCE == null)
            INSTANCE = new Director(sign);
        return INSTANCE;
    }

    public Director(String sign) {
        this.sign = sign;
    }

    public void sign() {
        System.out.println(sign);
    }

}

