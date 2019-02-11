package com.blog.service;

import java.util.List;

import com.blog.entity.User;

public interface UserService {

    public List<User> findAllBlogList();

    public User findBlogById(long id);

    public void save(User blog);

    public void edit(User blog);

    public void delete(User blog);

}
