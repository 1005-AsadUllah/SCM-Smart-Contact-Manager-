package com.smc.smc.entities;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class User {
    
    @Id// information about user
    private String userId;
    @Column(name="user_name",nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private String password;
    @Column(columnDefinition = "Text")
    private String profilePicString;
    @Column(columnDefinition = "TEXT")
    private String about;
    private String phone;
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    private Providers provider=Providers.SELF;
    private Providers providerUserId;

    @OneToMany(mappedBy = "user",cascade= CascadeType.ALL,fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();

   


}