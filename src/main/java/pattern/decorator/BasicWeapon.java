package pattern.decorator;

public class BasicWeapon implements Weapon {
    @Override
    public String shot() {
        return "shot!";
    }
}
