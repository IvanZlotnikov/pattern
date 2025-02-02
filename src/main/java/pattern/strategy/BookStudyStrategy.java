package pattern.strategy;

public class BookStudyStrategy implements StudyStrategy {
    @Override
    public void study(String skill) {
        System.out.println("Studying the skill \"" + skill + "\" using books.");
    }
}
