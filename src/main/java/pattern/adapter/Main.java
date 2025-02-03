package pattern.adapter;

public class Main {
    public static void main(String[] args) {
        Spell faireWizard = new Wizard();
        faireWizard.cast();

        Human scaredBoy = new Human();
//        scaredBoy.useHumanSkill();
        HumanAdapter adapter = new HumanAdapter(scaredBoy);
        adapter.cast();
    }
}
