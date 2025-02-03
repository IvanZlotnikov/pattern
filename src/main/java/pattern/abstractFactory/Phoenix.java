package pattern.abstractFactory;

public class Phoenix extends AbstractCreature{
    @Override
    public void makeSound() {
        System.out.println("Phoenix sound: ");
    }

    @Override
    public String getDescription() {
        return "Phoenix is a mythical bird that rise from the ashes.";
    }
}
