package pattern.factory;

public class CreatureFactory {

    public static Creature createCreature(String type) {
        if (type.equalsIgnoreCase("grifon")) {
            return new Grifon();
        } else if (type.equalsIgnoreCase("dragon")) {
            return new Dragon();
        } else {
            throw new IllegalArgumentException(type + ": unknown creature type");
        }
    }
}
