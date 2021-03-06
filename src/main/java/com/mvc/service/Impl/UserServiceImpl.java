package com.mvc.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.UserDao;
import com.mvc.model.User;
import com.mvc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void saveOrUpdate(User user) {

		if (findById(user.getId())==null) {
			userDao.save(user);
		} else {
			userDao.update(user);
		}

	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}
	
	@Override
	public boolean logincheck(String account, String password) {
		return userDao.logincheck(account, password);
	}
	
	@Override
	public boolean accountCheck(String account) {
		return userDao.accountCheck(account);
	}
	
	
	@Override
	public boolean register(String account, String password, String email) {
		return userDao.register(account, password, email);
	}
	
	@Override
	public Map<String, Object> accountInfo(String account) {
		return userDao.accountInfo(account);
	}

}