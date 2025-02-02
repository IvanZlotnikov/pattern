package pattern.strategy;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", new BookStudyStrategy());
        student1.learnSkill("java core");

        student1.setStudyStrategy(new VideoStudyStrategy());
        student1.learnSkill("pattern strategy");

        student1.setStudyStrategy(new PracticalStudyStrategy());
        student1.learnSkill("write pattern strategy");
    }
}
