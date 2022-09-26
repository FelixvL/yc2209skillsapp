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

  //  public Chat(){}






}
