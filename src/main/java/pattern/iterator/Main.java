package pattern.iterator;

public class Main {
    public static void main(String[] args) {


        String[] items = {"Anna","Sergei","Andrei"};
        MyCollection myCollection = new MyCollection(items);

        MyIterator<String> iterator= myCollection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
