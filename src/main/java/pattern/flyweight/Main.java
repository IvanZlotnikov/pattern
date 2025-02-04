package pattern.flyweight;

public class Main {
    public static void main(String[] args) {

        // by hand
//        Owl owl1 = new Owl("Owl", "white");
//        Owl owl2 = new Owl("Owl", "white");

        //by pattern
        var factory = new CreatureFactory();
        Creature owl1 = factory.getCreature("owl","white");
        Creature owl2 = factory.getCreature("owl","white");

        System.out.println(owl1 == owl2);
        owl1.display("AyF","Bili");
        owl2.display("Yr","Dan");

//        Creature cat1 = new Cat("cat", "black");
//        Creature cat2 = new Cat("cat", "black");

        Creature cat1 = factory.getCreature("cat","black");
        Creature cat2 = factory.getCreature("cat","black");

        System.out.println(cat1 == cat2);
        cat1.display("Gav","Timi");
        cat2.display("Myr","Lizi");
    }
}
