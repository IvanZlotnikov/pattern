package pattern.observer;

public class Main {
    public static void main(String[] args) {

        University skarina = new University();
        skarina.registerObserver(new Student1());
        skarina.setEvent("Exam is begin");

        skarina.registerObserver(new Student2());
        skarina.notifyObservers();
    }
}
