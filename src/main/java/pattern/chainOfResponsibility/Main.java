package pattern.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        MyHandler1 handler1 = new MyHandler1();
        MyHandler2 handler2 = new MyHandler2();
        MyHandler3 handler3 = new MyHandler3();

        handler1.setNext(handler2);
        handler2.setNext(handler3);

        Request req1 = new Request(RequestType.TYPE1);
        Request req2 = new Request(RequestType.TYPE2);
        Request req3 = new Request(RequestType.TYPE3);

        handler1.handleRequest(req1);
        handler2.handleRequest(req2);
        handler3.handleRequest(req3);
    }
}
