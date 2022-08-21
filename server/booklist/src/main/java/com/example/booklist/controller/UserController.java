package com.example.booklist.controller;


import com.example.booklist.model.Book;
import com.example.booklist.model.User;
import com.example.booklist.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {


    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "api/users")
    public List<User> getAllUsers (){
        return userService.getAllUsers();
    }

    @PostMapping(path = "/api/addUser")
    public void addNewUser (@RequestBody User user){
        userService.addNewUser(user);
    }

    @PostMapping(path = "/api/{id}/addUsersBook")
    public void addUsersBook(@RequestBody Book book, @PathVariable("id") Long id){
        userService.addUsersBook(book,id);
    }

}
