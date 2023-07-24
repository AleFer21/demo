package com.example.entities;

import com.example.enums.Role;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter @Setter
@ToString @EqualsAndHashCode
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String contact;
    private String address;
    private String password;
    private boolean status;
    @OneToOne
    private Image profileImg;
    @OneToMany
    private List<Comment> commentList;
    @OneToMany
    private List<Video> videoList;
    @Enumerated
    private Role role;
}
