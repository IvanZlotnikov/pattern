package pattern.factory;

public class Dragon implements Creature {
    @Override
    public void makeSound() {
        System.out.println("Dragon sound:");
    }

    @Override
    public String description() {
        return "The dragon is a large creature that can" +
               " breathe fire.";
    }
}
