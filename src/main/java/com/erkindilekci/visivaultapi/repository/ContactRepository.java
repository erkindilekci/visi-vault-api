package com.erkindilekci.visivaultapi.repository;

import com.erkindilekci.visivaultapi.modal.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
    Optional<Contact> findById(String id);
}
