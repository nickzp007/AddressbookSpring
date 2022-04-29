package com.bridgelabz.adderssbook.service;


import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.entity.ContactPerson;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Address book service class implementation and it implements IAddressBookService interface
 */
@Service
public class AddressBookServiceImpl implements IAddressBookService {
    @Override
    public  List<ContactPerson> getContactPersonList() {

        List<ContactPerson> contactPersonList= new ArrayList<>();
        contactPersonList.add( new ContactPerson(1,new AddressBookDTO("NIkhil","Patil","Mumbai","Mah",400087,7246456466,"nik07@gm.com")));
        return contactPersonList;
    }

    @Override
    public ContactPerson getContactByID(int id) {
        return new ContactPerson (2,new AddressBookDTO("NIkhil","Patil","Mumbai","Mah",400087,7246456466,"nik07@gm.com"));

    }

    @Override
    public ContactPerson createContactPerson(AddressBookDTO addressBookDTO) {
        return new ContactPerson(1,addressBookDTO);
    }

    @Override
    public ContactPerson updateContactPerson(AddressBookDTO addressBookDTO) {
        return new ContactPerson(1,addressBookDTO);
    }

    @Override
    public void deleteContactByID(int id) {

    }
}

