package nl.yc2209.skillapp.models;

import javax.persistence.*;

@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @OneToOne
    Group group;

    //@OneToMany
   // Message message;

public Chat(){}

  //  public Chat(){} Docent was niet overtuigd dat deze nodig was, met argumenten er in

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

}
