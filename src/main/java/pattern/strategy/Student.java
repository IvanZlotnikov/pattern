package pattern.strategy;

public class Student {
    private String name;
    private StudyStrategy studyStrategy;

    public Student(String name, StudyStrategy studyStrategy) {
        this.name = name;
        this.studyStrategy = studyStrategy;
    }

    public void setStudyStrategy(StudyStrategy studyStrategy) {
        this.studyStrategy = studyStrategy;
    }

    public void learnSkill(String skill) {
        System.out.println(name+" learn skill "+skill);
        studyStrategy.study(skill);
    }
}
