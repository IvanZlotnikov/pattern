package pattern.chainOfResponsibility;

public class MyHandler3 extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE3){
            System.out.println("MyHandler3 handleRequest");
        }else {
            super.handleRequest(request);
        }
    }
}
