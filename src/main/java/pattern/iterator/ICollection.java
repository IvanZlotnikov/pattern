package pattern.iterator;

public interface ICollection<T> {
    MyIterator<T> iterator();
}
