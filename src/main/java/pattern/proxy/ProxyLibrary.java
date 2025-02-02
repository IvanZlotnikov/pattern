package pattern.proxy;

public class ProxyLibrary implements Library {
    private CityLibrary myLibrary;
    private String userRole;

    public ProxyLibrary(String userRole) {
        this.userRole = userRole;
        myLibrary = new CityLibrary();
    }

    @Override
    public void accessBook(String bookName) {
        if (hasAccess()) {
            myLibrary.accessBook(bookName);
        }else {
            System.out.println("Access denied to the book : " + bookName+".You need to get permission.");
        }
    }

    private boolean hasAccess() {
        return userRole.equalsIgnoreCase("student")
               || userRole.equalsIgnoreCase("teacher");
    }
}
