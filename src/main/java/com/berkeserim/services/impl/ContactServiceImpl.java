package com.berkeserim.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkeserim.entites.Contact;
import com.berkeserim.repository.ContactRepository;
import com.berkeserim.services.IContactServices;

@Service
public class ContactServiceImpl implements IContactServices{
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public Contact saveContact(Contact contact){
		return contactRepository.save(contact);	
	}
	@Override
	public List<Contact> getAllContacts() {	
		List<Contact> contactList =  contactRepository.findAll();
		return contactList;
	}
	@Override
	public Contact getContactById(Integer id) {
		Optional<Contact> optional = contactRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	@Override
	public void deleteContact(Integer id) {
		Contact sqlContact = getContactById(id);
		if (sqlContact!=null) {
			contactRepository.delete(sqlContact);
			
		}
	}
	@Override
	public Contact updateContact(Integer id, Contact newContact) {
		Contact sqlContact = getContactById(id);
		if (sqlContact!= null) {
			sqlContact.setPhoneNumber(newContact.getPhoneNumber());
			sqlContact.setPhoneNumber1(newContact.getPhoneNumber1());
			sqlContact.setFirstName(newContact.getFirstName());
			sqlContact.setLastName(newContact.getLastName());
			sqlContact.setAddressHome1(newContact.getAddressHome1());
			sqlContact.setAddressHome2(newContact.getAddressHome2());
			sqlContact.setMail1(newContact.getMail1());
			sqlContact.setMail2(newContact.getMail2());
			sqlContact.setCompanyAddress(newContact.getCompanyAddress());
			sqlContact.setLabel(newContact.getLabel());
			sqlContact.setNotes(newContact.getNotes());
			sqlContact.setBirthDate(newContact.getBirthDate());
			
			return contactRepository.save(sqlContact);
		}
		return null;
	}

}
