package com.user.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.UserService.entity.Contact;
import com.user.UserService.entity.User;
import com.user.UserService.service.UserService;
import com.user.UserService.serviceImpl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/user/getUserDetails/{userId}")
	public User getUserDetailsController(@PathVariable Integer userId) {

		UserService userServiceImpl = new UserServiceImpl();

		User user = userServiceImpl.getUserDetails(userId);

		List<Contact> contactDetails = restTemplate.getForObject("http://contact-service/contact/getContactDetails/"+userId,
				List.class);

		user.setUserContact(contactDetails);

		// http://localhost:9002/contact/getContactDetails/1

		return user;

	}

}
