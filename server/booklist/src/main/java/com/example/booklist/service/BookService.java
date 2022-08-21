package com.example.booklist.service;

import com.example.booklist.model.Book;
import com.example.booklist.model.User;
import com.example.booklist.repository.BookRepository;
import com.example.booklist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;


    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public void addNewBook(Book book, Long userId) {
        List<Book> bookExist =bookRepository.findBookByAuthorEqualsAndTitleEquals(book.getAuthor(), book.getTitle());
        if (bookExist.size() == 0 ){
            User user = userRepository.findById(userId).get();
            book.addUser(user);
            bookRepository.save(book);
        }
        
    }

    public void deleteUser(Long id) {
       bookRepository.deleteById(id);
    }
}
