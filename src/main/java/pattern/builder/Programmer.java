package pattern.builder;

import java.util.List;


public class Programmer {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hardSkills;
    private List<String> softSkills;

    public Programmer() {
    }
    public Programmer(String firstName, String lastName, int age, List<String> hardSkills, List<String> softSkills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hardSkills = hardSkills;
        this.softSkills = softSkills;
    }

    @Override
    public String toString() {
        return "Programmer{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", age=" + age +
               ", hardSkills=" + hardSkills +
               ", softSkills=" + softSkills +
               '}';
    }

}
