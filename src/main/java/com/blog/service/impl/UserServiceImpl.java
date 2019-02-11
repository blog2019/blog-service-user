package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.User;
import com.blog.repository.UserRepository;
import com.blog.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository blogRepository;

    @Override
    public List<User> findAllBlogList() {
        return blogRepository.findAll();
    }

    @Override
    public User findBlogById(long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(User blog) {
    	blogRepository.save(blog);
    }

    @Override
    public void edit(User blog) {
    	blogRepository.save(blog);
    }

    @Override
    public void delete(User blog) {
    	blogRepository.delete(blog);
    }
}


