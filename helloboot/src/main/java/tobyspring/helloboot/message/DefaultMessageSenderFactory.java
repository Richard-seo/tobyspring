package tobyspring.helloboot.message;

public class DefaultMessageSenderFactory implements MessageSenderFactory{
    @Override
    public MessageSender getMessageSender(String senderType) {
        if("kakao".equals(senderType)) return new KakaoMessageSender();
        else return new SmsMessageSender();
    }
}
