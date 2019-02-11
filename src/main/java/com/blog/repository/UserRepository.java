package com.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById (long id);
    
    public User save(User blog);
}