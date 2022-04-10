package com.contact.contactService.service;

import java.util.List;

import com.contact.contactService.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactDetails(Integer userId);

}
