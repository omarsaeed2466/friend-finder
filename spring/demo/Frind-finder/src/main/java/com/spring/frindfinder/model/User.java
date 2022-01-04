package com.spring.frindfinder.model;

import com.spring.frindfinder.model.enums.Gender;

import java.util.Date;
import java.util.List;

public class User {
    private long id ;
    private String firstname ;
    private String lastname ;
    private String age ;
    private String phoneNumber ;
    private Date date ;
    private Gender gender;
    private List<post> posts;
    private List<friend> friends;

}
