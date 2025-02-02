package pattern.decorator;

public class PoisonWeapon extends WeaponDecorator{
    public PoisonWeapon(Weapon decoretedWeapon) {
        super(decoretedWeapon);
    }

    @Override
    public String shot() {
        return super.shot()+" "+"poisoned";
    }
}
