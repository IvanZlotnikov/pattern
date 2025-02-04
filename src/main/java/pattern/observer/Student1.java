package pattern.observer;

public class Student1 implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Student1 found out about: " + event);
    }
}
