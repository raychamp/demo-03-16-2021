package com.web.mvc.service;

import java.util.List;

import com.web.mvc.model.User;

public interface LoginService {

	User findById(long id);

	User findByNameAndPassword(String name, String password);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(long id);

	List<User> findAllUsers();

	void deleteAllUsers();

	public boolean isUserExist(User user);

	User doLogin(String username, String password);

}
