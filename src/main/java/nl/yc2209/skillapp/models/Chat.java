package nl.yc2209.skillapp.models;

import org.aspectj.bridge.Message;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @OneToMany
//    //A list containing objects of type 'Message'. The list is called 'messages'
//    List<Message> messages; //using plural here for it a chat can have many messages

    public Chat(){} // you need this in order to post

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

//    public List<Message> getMessage(){return messages;}
//
//    public void setMessages(List <Message> messages){
//        this.messages = messages;
//    }
}