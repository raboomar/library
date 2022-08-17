package com.example.booklist.model;

import lombok.*;

import javax.persistence.*;
@ToString
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class book {

    @Id
    @SequenceGenerator(name = "book_sequence", sequenceName = "book_sequence", allocationSize = 1)
    @GeneratedValue(generator = "book_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private boolean readIt;

    public book(String title, String author, boolean readIt) {
        this.title = title;
        this.author = author;
        this.readIt = readIt;
    }


}
