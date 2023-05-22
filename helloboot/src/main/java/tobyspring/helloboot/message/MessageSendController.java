package tobyspring.helloboot.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageSendController {
    private MessageSendService messageSendService;

    public MessageSendController(MessageSendService messageSendService) {
        this.messageSendService = messageSendService;
    }

    @GetMapping("/send-message")
    public String sendMessage(String senderType) {
        return messageSendService.sendMessage(senderType);
    }
}
