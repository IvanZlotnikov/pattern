package pattern.abstractFactory;

public class Horse extends AbstractCreature{
    @Override
    public void makeSound() {
        System.out.println("Horse sound: ");
    }

    @Override
    public String getDescription() {
        return "The Horse can fast run.";
    }
}
