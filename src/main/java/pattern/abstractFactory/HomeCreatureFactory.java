package pattern.abstractFactory;

public class HomeCreatureFactory implements CreatureFactory{
    @Override
    public AbstractCreature createBird() {
        return new Owl();
    }

    @Override
    public AbstractCreature createBeast() {
        return new Horse();
    }
}
