package pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Title1",
                "Author1");

        Book book2 = (Book) book1.clone();

        book2.setTitle("Title2");

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1 == book2);
    }
}
