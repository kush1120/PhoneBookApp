package com.bikkadIt.PhoneBookApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.PhoneBookApplication.model.Contact;
import com.bikkadIt.PhoneBookApplication.service.ContactServiceI;

@RestController
public class ContactController {
	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping(value="/saveContact",consumes = "APPLICATION/JSON")
	
	public ResponseEntity<String>saveContact(@RequestBody Contact contact){
		
		boolean saveContact = contactServiceI.saveContact(contact);
		if(saveContact == true) {
			String msg="Contact save Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}else {
			String msg="Contact is not created Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
		
		
	}

}
