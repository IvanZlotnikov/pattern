package pattern.abstractFactory;

public class Bear extends AbstractCreature{
    @Override
    public void makeSound() {
        System.out.println("Bear sound: ");
    }

    @Override
    public String getDescription() {
        return "The bear is a big creature and very strong";
    }
}
