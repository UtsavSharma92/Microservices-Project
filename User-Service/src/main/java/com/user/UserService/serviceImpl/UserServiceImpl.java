package com.user.UserService.serviceImpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.UserService.entity.User;
import com.user.UserService.service.UserService;

@Service
public class UserServiceImpl implements UserService {

//	List<User> userDetails = new ArrayList<>();

	List<User> userDetails = Arrays.asList(new User(1, "Utsav", 123), new User(2, "Vastu", 654),
			new User(3, "something", 942));

	public User getUserDetails(int userId) {

		return userDetails.stream().filter(userabc -> userabc.getUserId().equals(userId)).findAny().orElse(null);
	}

	public void saveUserDetails() {

	}

}
