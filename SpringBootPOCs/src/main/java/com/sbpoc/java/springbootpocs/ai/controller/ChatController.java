package com.sbpoc.java.springbootpocs.ai.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatClient client;

    public ChatController(ChatClient.Builder builder){
        this.client = builder.build();
    }


    @GetMapping
    public String chat(String msg){

        return client
                .prompt()
                .user(msg)
                .call()
                .content();
    }
}