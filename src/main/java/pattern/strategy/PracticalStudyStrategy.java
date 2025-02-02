package pattern.strategy;

public class PracticalStudyStrategy implements StudyStrategy {
    @Override
    public void study(String skill) {
        System.out.println("Practicing the skill \""+skill+"\" while working on a computer");
    }
}
