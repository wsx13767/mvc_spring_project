package com.mvc.dao;

import java.util.List;

import com.mvc.model.User;

public interface UserDao {

	User findById(Integer id);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Integer id);

	boolean logincheck(String account, String password);
}