package pattern.chain2;

public class MessageCheckHandler extends MessageHandler{
    public MessageCheckHandler(MessageHandler messageHandler) {
        super(messageHandler);
    }

    @Override
    void handle(String message) {
        if(!message.matches(".*\\d.*")){
            messageHandler.handle(message);
        }
    }

}
