package pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Director {

    public Builder createJunior(Builder builder) {
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java Core");
        hardSkills.add("OS Windows");
        hardSkills.add("Notepad");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Трудолюбивый");
        softSkills.add("Веселый");
        softSkills.add("Любознательный");
        builder.setSoftSkills(softSkills);
        return builder;
    }
    public Builder createMiddle(Builder builder) {
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Java EE");
        hardSkills.add("OS Linux");
        hardSkills.add("Spring");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Спокойный");
        softSkills.add("Рассудтьельный");
        softSkills.add("Коммуникабельный");
        builder.setSoftSkills(softSkills);
        return builder;
    }

    public Builder createSenior(Builder builder) {
        List<String> hardSkills = new ArrayList<>();
        hardSkills.add("Micro Service");
        hardSkills.add("Kafka");
        hardSkills.add("Oracle");
        builder.setHardSkills(hardSkills);
        List<String> softSkills = new ArrayList<>();
        softSkills.add("Психически устойчивым");
        softSkills.add("Способным обучать");
        softSkills.add("Способным организатором");
        builder.setSoftSkills(softSkills);
        return builder;
    }







}
