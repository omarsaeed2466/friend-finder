package com.spring.frindfinder.model;

import javax.persistence.*;

@Entity(name = "friend")
public class friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id ;
    @Column(name = "friend_id")
    private int idFriend ;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user ;

}
