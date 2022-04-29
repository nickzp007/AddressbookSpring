package com.bridgelabz.addressbook.controller;


import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.entity.ContactPerson;
import com.bridgelabz.addressbook.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    IAddressBookService iAddressBookService;
    /**
     * get the all data from JSON object
     * @return data and status for get request
     */
    @GetMapping(value = {"","/","/get"})
    public ResponseEntity<String> getAddressBook(){
        List<ContactPerson> contactPersonList= iAddressBookService.getContactPersonList();
        ResponseDTO responseDTO=new ResponseDTO("Get Mapping success",contactPersonList);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }


    /**
     * get the contact by using id
     * @param id of the contact
     * @return data with status
     */
    @GetMapping("get/{contactId}")
    public ResponseEntity<String> getContactByID(@PathVariable("contactId") int id){
        ContactPerson contactPerson=iAddressBookService.getContactByID(id);

        ResponseDTO responseDTO= new ResponseDTO("Get call by Id success",contactPerson);
        return new ResponseEntity(responseDTO, HttpStatus.OK);

    }

    /**
     * created a new contact
     * @param addressBookDTO get the dta inform of JSON from user
     * @return data with status
     */
    @PostMapping("/create")
    public ResponseEntity<String> createContact(@RequestBody AddressBookDTO addressBookDTO){
        ContactPerson contactPerson=iAddressBookService.createContactPerson(addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Created new contact in address book",contactPerson);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    /**
     * Update a new contact
     * @param addressBookDTO get the data inform of JSON from user
     * @return data with status
     */
    @PutMapping("/update")
    public ResponseEntity<String> updateContact(@RequestBody AddressBookDTO addressBookDTO){
        ContactPerson contactPerson=iAddressBookService.updateContactPerson(addressBookDTO);
        ResponseDTO responseDTO= new ResponseDTO("Updated new contact in address book",contactPerson);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }

    /**
     * delete a new contact
     * @param id delete contact for given id
     * @return data with status
     */
    @DeleteMapping("delete/id")
    public  ResponseEntity<String> deleteContact(@PathVariable("id") int id){
        ContactPerson contactPerson=null;

        iAddressBookService.deleteContactByID(id);
        ResponseDTO responseDTO= new ResponseDTO("Delect contact by id"+id,contactPerson);
        return new ResponseEntity(responseDTO, HttpStatus.OK);
    }
}