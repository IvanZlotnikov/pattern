package pattern.flyweight;

public class Cat implements Creature{

    String type;
    String color;

    public Cat(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void display(String name, String owner) {
        System.out.println("Cat{" +
                           "type='" + type + '\'' +
                           ", color='" + color + '\'' +
                           ", name='" + name + '\'' +
                           ", owner='" + owner + '\'' +
                           '}');
    }
}
