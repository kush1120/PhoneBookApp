package com.bikkadIt.PhoneBookApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIt.PhoneBookApplication.model.Contact;
import com.bikkadIt.PhoneBookApplication.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactServiceI{
	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = contactRepository.save(contact);
		if(save != null) {
			return true;
			
		}else {
			return false;
		}
	
	
	}

}
