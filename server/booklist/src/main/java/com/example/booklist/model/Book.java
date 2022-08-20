package com.example.booklist.model;

import lombok.*;
import org.apache.catalina.User;

import javax.persistence.*;
@ToString
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private boolean readIt;
    @ManyToOne
    @JoinColumn(name =  "user_id")
    private Users users;

    public Book(String title, String author, boolean readIt, Users users) {
        this.title = title;
        this.author = author;
        this.readIt = readIt;
        this.users = users;
    }
}
