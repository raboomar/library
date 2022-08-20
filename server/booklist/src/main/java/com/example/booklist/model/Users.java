package com.example.booklist.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@ToString
@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    @OneToMany(
            mappedBy = "users",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Book> books = new ArrayList<>();

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
