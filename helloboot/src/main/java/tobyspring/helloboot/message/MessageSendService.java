package tobyspring.helloboot.message;

import org.springframework.stereotype.Service;

@Service
public class MessageSendService {
    public String sendMessage(String senderType) {
        return MessageSenderFactory.getInstance().getMessageSender(senderType).sendMessage(senderType, senderType);
    }
}
