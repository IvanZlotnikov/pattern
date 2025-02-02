package pattern.proxy;

public class Main {
    public static void main(String[] args) {
        Library lib = new CityLibrary();
        lib.accessBook("an ordinary book");

        Library lib2 = new ProxyLibrary("student");
        lib2.accessBook("Student Proxy");

        Library lib3 = new ProxyLibrary("spy");
        lib3.accessBook("Spy Proxy");

        Library lib4 = new ProxyLibrary("teacher");
        lib4.accessBook("Spy Proxy");
    }
}
