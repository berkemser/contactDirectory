package com.berkeserim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berkeserim.entites.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	

}
