package pattern.abstractFactory;

public class ForestCreatureFactory implements CreatureFactory {
    @Override
    public AbstractCreature createBird() {
        return new Phoenix();
    }

    @Override
    public AbstractCreature createBeast() {
        return new Bear();
    }
}
