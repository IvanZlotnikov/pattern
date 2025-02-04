package pattern.observer;

public class Student2 implements Observer {
    @Override
    public void update(String event) {
        System.out.println("Student2 found out about: " + event);
    }
}
