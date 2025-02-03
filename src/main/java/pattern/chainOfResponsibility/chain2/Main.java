package pattern.chainOfResponsibility.chain2;

public class Main {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageAddToBackHandler(
                new MessageCheckHandler(
                        new MessagePrintHandler(null)));

        messageHandler.handle("Hello my linkedList");
    }
}
