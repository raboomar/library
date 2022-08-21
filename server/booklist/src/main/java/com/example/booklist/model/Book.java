package com.example.booklist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@ToString
@Entity (name = "Book")
@Table (name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long book_id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private boolean readIt;

@JsonIgnore
@ManyToMany
@JoinTable(
        name = "books_in_lib",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
)
    private List<User> users = new ArrayList<>();

    public Book(String title, String author, boolean readIt, User user) {
        this.title = title;
        this.author = author;
        this.readIt = readIt;
//        this.user = user;
    }

    public void addUser(User user) {
        users.add(user);
    }
}
