package nl.yc2209.skillapp.service;

import nl.yc2209.skillapp.models.Chat;
import nl.yc2209.skillapp.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public void addNewChat(Chat chat) {
    }

    public List<Chat> getAllChats() {
        return chatRepository.findAll();
    }
}
