package com.berkeserim.controller;

import java.util.List;

import com.berkeserim.entites.Contact;

public interface IContactController{
	public Contact saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(Integer Id);
	
	public void deleteContact(Integer id);
	
	public Contact updateContact(Integer id , Contact updateContact);
}