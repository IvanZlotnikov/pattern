package pattern.singleton;

public class DirectorTest {
    public static void main(String[] args) {

        Director director = Director.getInstance("GoGOGo");
        director.sign();

        Director director2 = Director.getInstance("32235");
        director2.sign();

    }
}
