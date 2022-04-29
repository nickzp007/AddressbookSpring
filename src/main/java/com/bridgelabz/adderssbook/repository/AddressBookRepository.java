package com.bridgelabz.adderssbook.repository;

import com.bridgelabz.addressbook.entity.ContactPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressBookRepository extends JpaRepository<ContactPerson,Long>{


    @Query(value = "select * from address_book where email_Id = :emailId and password= :pass",nativeQuery = true)
    ContactPerson findDataByNameAndPassword(String emailId, String pass);

    @Query(value = "SELECT password from address_book WHERE email_Id = :email_Id",nativeQuery = true)
    String findPassword( String email_Id);

}