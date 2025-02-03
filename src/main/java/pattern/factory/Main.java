package pattern.factory;

public class Main {
    public static void main(String[] args) {
        Creature dragon = CreatureFactory.createCreature("dragon");
        dragon.makeSound();

        Creature grifon = CreatureFactory.createCreature("grifon");
        System.out.println(grifon.description());
    }
}
