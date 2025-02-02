package pattern.chainOfResponsibility;

public class MyHandler2 extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE2){
            System.out.println("MyHandler2 handleRequest");
        }else {
            super.handleRequest(request);
        }
    }
}
