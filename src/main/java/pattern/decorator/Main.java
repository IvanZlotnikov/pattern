package pattern.decorator;

public class Main {
    public static void main(String[] args) {

        Weapon basicWeapon = new BasicWeapon();
        System.out.println(basicWeapon.shot());

        Weapon weaponWithMuffler = new MufflerWeapon(basicWeapon);
        System.out.println(weaponWithMuffler.shot());

        Weapon weaponWithPoison = new PoisonWeapon(basicWeapon);
        System.out.println(weaponWithPoison.shot());

        Weapon allFunctionWeapon = new PoisonWeapon(new MufflerWeapon(basicWeapon));
        System.out.println(allFunctionWeapon.shot());
    }
}
