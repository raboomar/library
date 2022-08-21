package com.example.booklist.service;


import com.example.booklist.model.Book;
import com.example.booklist.model.User;
import com.example.booklist.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public void addUsersBook(Book book, Long id) {
        Optional<User> user = userRepository.findById(id);




    }
}
