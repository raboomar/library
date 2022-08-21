package com.example.booklist.repository;

import com.example.booklist.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
//    @Query (value = "SELECT * FROM BOOK WHERE author = author & title = title", nativeQuery = true)
    List<Book> findBookByAuthorEqualsAndTitleEquals(String author, String title);
}
