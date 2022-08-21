package com.example.booklist.repository;

import com.example.booklist.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
//    @Query (value = "SELECT * FROM BOOK WHERE author = author & title = title", nativeQuery = true)
    List<Book> findBookByAuthorEqualsAndTitleEquals(String author, String title);
    @Query(value = "select book.title, book.author, book.book_id,book.read_it from book join books_in_lib on book.book_id = books_in_lib.book_id and books_in_lib.user_id = :#{#userId}" , nativeQuery = true)
    List<Book> findUsersBooks(@PathVariable("userId") Long userId);
}
