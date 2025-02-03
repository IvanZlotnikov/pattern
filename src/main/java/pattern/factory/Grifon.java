package pattern.factory;

public class Grifon implements Creature{
    @Override
    public void makeSound() {
        System.out.println("Grifon sound:");
    }

    @Override
    public String description() {
        return "The grifon is a mythical creature with body of a lion" +
               " and the head of the eagle";
    }
}
