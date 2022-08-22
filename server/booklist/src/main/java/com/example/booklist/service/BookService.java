package com.example.booklist.service;

import com.example.booklist.model.Book;
import com.example.booklist.model.User;
import com.example.booklist.repository.BookRepository;
import com.example.booklist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        User user = userRepository.findById(userId).get();
           book.addUser(user);
           bookRepository.save(book);
    }

    public void deleteUser(Long id) {
       bookRepository.deleteById(id);
    }

    public List<Book> getBookByUsersId(Long userId) {
        return bookRepository.findUsersBooks(userId);
    }

    @Transactional
    public Book updateBook(Book book, Long bookId) {
        Book bookInDb =  bookRepository.findById(bookId).get();
        if(bookInDb.getAuthor() != book.getAuthor()){
            bookInDb.setAuthor(book.getAuthor());
        }
        if(bookInDb.getTitle() != book.getTitle()){
            bookInDb.setTitle(book.getTitle());
        }
        if (bookInDb.isReadIt() != book.isReadIt()){
            bookInDb.setReadIt(book.isReadIt());
        }
        bookRepository.save(bookInDb);
        return bookInDb;
    }
}
