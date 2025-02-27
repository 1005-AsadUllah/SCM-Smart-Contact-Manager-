package com.smc.smc.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.*; 

@Entity

public class Contact {


    // information about contact
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String image;
    @Column(columnDefinition = "Text")
    private String description;
    private boolean favorite = false;

    private String webStieLink;
    private String facebookLink;

    @ManyToOne
    private User user;

     @OneToMany(mappedBy = "contact",cascade= CascadeType.ALL,fetch = FetchType.EAGER, orphanRemoval = true)
    private List<SocialLink> links = new ArrayList<>();

  



}
