package com.berkeserim.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkeserim.controller.IContactController;
import com.berkeserim.entites.Contact;
import com.berkeserim.services.IContactServices;

@RestController
@RequestMapping("/rest/api/contact-directory")
public class ContactControllerImpl implements IContactController {
	
	@Autowired
	private IContactServices contactServices;
	
	
	@PostMapping(path = "/save")
	@Override
	public Contact saveContact(@RequestBody Contact contact) {
		return contactServices.saveContact(contact);
	}

	@GetMapping(path = "/list")
	@Override
	public List<Contact> getAllContacts() {
		
		return contactServices.getAllContacts();
	}
	@GetMapping(path = "/list/{id}")
	@Override
	public Contact getContactById(@PathVariable(name = "id") Integer id) {
		return contactServices.getContactById(id);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteContact(@PathVariable(name = "id")Integer id) {
		contactServices.deleteContact(id);
	}
	
	@PutMapping(path = "/update/{id}")
	@Override
	public Contact updateContact(@PathVariable(name = "id") Integer id, @RequestBody Contact updateContact) {
		return contactServices.updateContact(id, updateContact);
	}
}
