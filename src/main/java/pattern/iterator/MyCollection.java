package pattern.iterator;

public class MyCollection<T> implements ICollection {

    private T[] items;
    private int size;

    public MyCollection(T[] items) {
        this.items = items;
        this.size = items.length;
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<T>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }
}
