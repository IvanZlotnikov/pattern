package pattern.chainOfResponsibility;

public class MyHandler1 extends RequestHandler {

    @Override
    public void handleRequest(Request request) {
        if(request.getType() == RequestType.TYPE1){
            System.out.println("MyHandler1 handleRequest");
        }else {
            super.handleRequest(request);
        }
    }
}
