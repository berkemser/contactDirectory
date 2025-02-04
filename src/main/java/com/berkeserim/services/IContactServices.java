package com.berkeserim.services;

import java.util.List;

import com.berkeserim.entites.Contact;

public interface IContactServices {
	
	public Contact saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer id);
	
	public void deleteContact(Integer id);
	
	public Contact updateContact(Integer id , Contact newContact);
        
    
}
