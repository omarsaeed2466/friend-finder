package com.spring.frindfinder.model;

import com.spring.frindfinder.model.enums.Gender;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id ;
    @Column(name = "first_name")
    private String firstname ;
    @Column(name = "last_name")
    private String lastname ;
    @Column(name = "age")
    private String age ;
    @Column(name = "phone")
    private String phoneNumber ;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date ;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;
    @OneToMany(mappedBy = "user")
    private List<Post> posts;
    @OneToMany(mappedBy = "user")
    private List<friend> friends;

}
