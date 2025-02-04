package pattern.flyweight;

public class Owl implements Creature{

    private final String type;
    private final String color;

    public Owl(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void display(String name, String owner) {
        System.out.println("Owl{" +
                           "type='" + type + '\'' +
                           ", color='" + color + '\'' +
                           ", name='" + name + '\'' +
                           ", owner='" + owner + '\'' +
                           '}');
    }
}
