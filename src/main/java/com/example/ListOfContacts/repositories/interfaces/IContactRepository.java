package com.example.ListOfContacts.repositories.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.example.ListOfContacts.models.Contact;

public interface IContactRepository extends CrudRepository<Contact, Integer>{
}
