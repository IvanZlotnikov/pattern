package pattern.strategy;

public class VideoStudyStrategy implements StudyStrategy{
    @Override
    public void study(String skill) {
        System.out.println("Watching learning video on the \""+skill+"\" .");
    }
}
