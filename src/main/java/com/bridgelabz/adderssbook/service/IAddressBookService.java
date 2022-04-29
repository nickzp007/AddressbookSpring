package com.bridgelabz.adderssbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.entity.ContactPerson;

import java.util.List;

public interface IAddressBookService {

    List<ContactPerson> getContactPersonList();

    ContactPerson getContactByID(int id);

    ContactPerson createContactPerson(AddressBookDTO addressBookDTO);

    ContactPerson updateContactPerson(AddressBookDTO addressBookDTO);

    void deleteContactByID(int id);
}