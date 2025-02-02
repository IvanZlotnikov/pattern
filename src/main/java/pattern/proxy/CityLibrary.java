package pattern.proxy;

public class CityLibrary implements Library {
    @Override
    public void accessBook(String bookName) {
        System.out.println("Accessing the book: " + bookName);
    }
}
