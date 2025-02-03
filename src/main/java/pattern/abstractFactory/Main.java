package pattern.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractCreature phoenix = new ForestCreatureFactory().createBird();
        phoenix.makeSound();
        System.out.println(phoenix.getDescription());

        AbstractCreature owl = new HomeCreatureFactory().createBird();
        owl.makeSound();
        System.out.println(owl.getDescription());

        AbstractCreature horse = new HomeCreatureFactory().createBeast();
        horse.makeSound();
        System.out.println(horse.getDescription());

        AbstractCreature bear = new ForestCreatureFactory().createBeast();
        bear.makeSound();
        System.out.println(bear.getDescription());
    }
}
