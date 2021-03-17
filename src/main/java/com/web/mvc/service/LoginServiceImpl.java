package com.web.mvc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.web.mvc.model.User;

public class LoginServiceImpl implements LoginService {
	
private static final AtomicLong counter = new AtomicLong();
	
	private static List<User> users;
	
	static{
		users= populateDummyUsers();
	}
	
	
	@Override
	public User doLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private static List<User> populateDummyUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(counter.incrementAndGet(),"admin", "admin","NY", "sam@abc.com"));
		users.add(new User(counter.incrementAndGet(),"tomcat", "tomcat", "ALBAMA", "tomy@abc.com"));
		users.add(new User(counter.incrementAndGet(),"test", "test", "NEBRASKA", "kelly@abc.com"));
		return users;
	}


	@Override
	public User findByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
