package pattern.decorator;

public abstract class WeaponDecorator implements Weapon {

    protected Weapon decoretedWeapon;

    public WeaponDecorator(Weapon decoretedWeapon) {
        this.decoretedWeapon = decoretedWeapon;
    }

    @Override
    public String shot() {
        return decoretedWeapon.shot();
    }
}
