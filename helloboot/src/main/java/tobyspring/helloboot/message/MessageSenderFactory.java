package tobyspring.helloboot.message;

public interface MessageSenderFactory {
    public MessageSender getMessageSender(String senderType);
    static DefaultMessageSenderFactory getInstance() {
        return new DefaultMessageSenderFactory();
    }
}
