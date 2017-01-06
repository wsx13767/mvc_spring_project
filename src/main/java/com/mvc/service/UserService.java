package com.mvc.service;

import java.util.List;

import com.mvc.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
	//登入確認
	boolean logincheck(String account, String password);
	
}