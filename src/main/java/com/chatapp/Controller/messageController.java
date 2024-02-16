package com.chatapp.Controller;

import  com.chatapp.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class messageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody  Message message)
    {
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return  message;
    }
}
