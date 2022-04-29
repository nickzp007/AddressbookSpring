package com.bridgelabz.adderssbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.entity.ContactPerson;

import java.util.List;

public interface IAddressBookService {

    List<ContactPerson> getContactPersonList();

    ContactPerson getContactByID(long id);

    ContactPerson createContactPerson(AddressBookDTO addressBookDTO);

    ContactPerson updateContactPerson(int id, AddressBookDTO addressBookDTO);

    void deleteContactByID(long id);

    boolean getData(String name, String pass);

    boolean encodePassword(String password);
}