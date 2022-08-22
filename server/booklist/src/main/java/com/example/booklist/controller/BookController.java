package com.example.booklist.controller;

import com.example.booklist.model.Book;
import com.example.booklist.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class BookController {
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(path = "api/books")
    public List<Book> getAllBooks (){
        return bookService.getAllBooks();
    }

    @GetMapping(path = "api/usersBooks/{userId}")
    public List<Book> getAllUsersBooks(@PathVariable Long userId){
        return bookService.getBookByUsersId(userId);
    }

    @PostMapping(path = "/api/addNewBook/{userId}")
    public void addNewBook(@RequestBody Book book, @PathVariable Long userId){
        bookService.addNewBook(book, userId);
    }

    @PutMapping(path = "api/updateBook/{bookId}")
    public Book updateBook(@PathVariable Long bookId, @RequestBody Book book){
       return bookService.updateBook(book , bookId);
    }

    @DeleteMapping (path = ("/api/delete/{id}"))
    public void deleteUser(@PathVariable("id") Long id){
        bookService.deleteUser(id);
    }

}
