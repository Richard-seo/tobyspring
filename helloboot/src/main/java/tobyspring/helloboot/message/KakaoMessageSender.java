package tobyspring.helloboot.message;

public class KakaoMessageSender implements MessageSender{
    @Override
    public String sendMessage(String senderType, String message) {
        return senderType + " : " + message;
    }
}
