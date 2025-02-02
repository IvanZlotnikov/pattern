package pattern.decorator;

public class MufflerWeapon extends WeaponDecorator {

    public MufflerWeapon(Weapon decoretedWeapon) {
        super(decoretedWeapon);
    }

    @Override
    public String shot() {
        return super.shot()+" "+"without sound ";
    }
}
