package com.example.ListOfContacts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import com.example.ListOfContacts.models.Contact;
import com.example.ListOfContacts.models.ContactJSON;
import com.example.ListOfContacts.repositories.interfaces.IContactRepository;

import java.util.Map;

@RestController
public class ContactJSONController {

    @Autowired
    private IContactRepository contactRepository;

    @RequestMapping(value = "/addJSON", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.POST)
    public String addContact(@RequestBody ContactJSON contactJSON) {

        Contact contact = new Contact();
        contact.setName(contactJSON.getName());
        contact.setPhoneNumber(contactJSON.getPhoneNumber());
        contactRepository.save(contact);

        return "Контакт добавлен!";
    }


    @GetMapping(path="/getAllJSON")
    public Iterable<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}