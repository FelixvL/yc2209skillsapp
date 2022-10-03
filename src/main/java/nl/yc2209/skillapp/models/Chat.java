package nl.yc2209.skillapp.models;

import javax.persistence.*;


@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Chat(){} // you need this in order to post

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


}
