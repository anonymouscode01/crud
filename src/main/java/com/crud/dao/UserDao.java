package com.crud.dao;

import java.util.List;

import com.crud.model.User;

public interface UserDao {
    public abstract int insert(User user);
    public abstract void delete(int id);
    public abstract void update(User user);
    public abstract List<User> findAll();
    public abstract User findById(int id);
}
