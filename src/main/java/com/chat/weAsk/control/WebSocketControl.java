package com.chat.weAsk.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketControl {
    private final SimpMessagingTemplate template;

    @Autowired
    WebSocketControl(SimpMessagingTemplate template) {
        this.template = template;
    }

    @MessageMapping("/send/message")
    public void onReceivedMessage(String massage) throws Exception {
        this.template.convertAndSend("/chat", massage);
    }
}
