package pattern.singleton;

public class Director {

    private static volatile Director INSTANCE;

    private String sign;

    private Director() {
    }

    private Director(String sign) {
        this.sign = sign;
    }

    public static Director getInstance(String sign) {
        if (INSTANCE == null){
            synchronized (Director.class){
                if (INSTANCE == null){
                    INSTANCE = new Director();
                }
            }
        }
        return INSTANCE;
    }

    public void sign() {
        System.out.println(sign);
    }

}

