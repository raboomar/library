package com.example.booklist.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long user_id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;


@JsonIgnore
    @ManyToMany (mappedBy = "users")
    private List<Book> books = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
