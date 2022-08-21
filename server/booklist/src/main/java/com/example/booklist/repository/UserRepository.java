package com.example.booklist.repository;

import com.example.booklist.model.Book;
import com.example.booklist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   @Query(value = "select * from user where  user.username = username and  user.password= password", nativeQuery = true)
   Optional<User> findByUsernameEqualsAndPasswordEquals(String username, String password);
}
