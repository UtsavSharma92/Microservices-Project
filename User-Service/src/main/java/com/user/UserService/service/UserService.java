package com.user.UserService.service;

import com.user.UserService.entity.User;

public interface UserService {
	
	public User getUserDetails(int userId);
	
	public void saveUserDetails();

}
