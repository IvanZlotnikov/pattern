package pattern.adapter;

public class HumanAdapter implements Spell{
    private final Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    @Override
    public void cast() {
//        System.out.println("Run run run");
        human.useHumanSkill();
    }
}
