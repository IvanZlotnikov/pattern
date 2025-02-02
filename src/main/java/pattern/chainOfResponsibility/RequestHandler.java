package pattern.chainOfResponsibility;


public abstract class RequestHandler {
    private RequestHandler next;

    public void setNext(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be processed");
        }
    }
}
