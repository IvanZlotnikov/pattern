package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CreatureFactory {

    private final Map<String, Creature> creaturesMap = new HashMap<>();

    public Creature getCreature(String type, String color) {
        String key = type + ":" + color;

        if (!creaturesMap.containsKey(key)) {
            switch (type.toLowerCase()) {
                case "owl" ->
                        creaturesMap.put(key, new Owl(type, color));
                case "cat" ->
                        creaturesMap.put(key, new Cat(type, color));
                default -> throw new IllegalArgumentException("Invalid creature type: " + type);
            }
        }
        return creaturesMap.get(key);
    }

}
