package pattern.adapter;

public class Wizard implements Spell{
    @Override
    public void cast() {
        System.out.println("Fireball");
    }
}
