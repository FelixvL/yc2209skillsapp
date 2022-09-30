package nl.yc2209.skillapp.controllers;

import nl.yc2209.skillapp.models.Chat;
import nl.yc2209.skillapp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "chats")
//We map the endpoint request with "/chats" at the end,
//for any request that is related to the 'Chat' class

public class ChatController {
    private ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping
    public List<Chat> getAllChats(){
        return chatService.getAllChats();
    }

    @PostMapping
    public void createChat(@RequestBody Chat chat) {
        // call the function to create a chat through the service's method,
        // and input the chat that has been entered in the body
        chatService.addNewChat(chat);
    }
}

