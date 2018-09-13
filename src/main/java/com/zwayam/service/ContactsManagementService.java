package com.zwayam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zwayam.data.repos.CustomerContactRepository;
import com.zwayam.domain.CustomerContact;

@Service
public class ContactsManagementService {

	@Autowired
	private CustomerContactRepository customerContactRepository;
	
	public CustomerContact add(CustomerContact aContact) {
		
		CustomerContact newContact = customerContactRepository.save(aContact);
		
		return newContact;	
	}
	
	/*
	public CustomerContact addContactOccasion(CustomerContact aContact, ContactImportantOccasion anOccasion) {
		CustomerContact newContact = null;
		
		return newContact;	
	}
	*/
}
