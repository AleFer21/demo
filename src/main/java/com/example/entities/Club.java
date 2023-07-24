package com.example.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Entity
@Getter @Setter
@ToString @EqualsAndHashCode
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String contact;
    private boolean status;
    @OneToMany
    private List<Court> courtList;
    @OneToMany
    private List<Comment> commentList;
    @OneToMany
    private List<Image> imageList;

}
