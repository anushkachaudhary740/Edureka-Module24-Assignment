package com.cognologix.ContactMicroservices.service;

import com.cognologix.ContactMicroservices.model.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);

}