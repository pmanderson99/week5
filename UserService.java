package com.coderscampus.week5;

public class UserService {

	public User createUser(String userInfo[]) {
		User user = new User("username345", "password678", "jane");
		user.setUsername(userInfo[0]);
		user.setPassword(userInfo[1]);
		user.setName(userInfo[2]);
		return user;
	}
	
	
}