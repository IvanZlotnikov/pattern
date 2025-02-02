package pattern.chain2;

public class MessageAddToBackHandler extends MessageHandler {
    public MessageAddToBackHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        messageHandler.handle(message + "!");
    }
}
