package pattern.chain2;

public abstract class MessageHandler {
    MessageHandler messageHandler;

    public MessageHandler(MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    abstract void handle(String message);
}
