package pattern.abstractFactory;

public class Owl extends AbstractCreature{
    @Override
    public void makeSound() {
        System.out.println("Owl sound: ");
    }

    @Override
    public String getDescription() {
        return "The owl is wise that serves as a messenger.";
    }
}
