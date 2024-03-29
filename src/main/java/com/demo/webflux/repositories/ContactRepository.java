package com.demo.webflux.repositories;

import com.demo.webflux.collections.Contact;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends ReactiveMongoRepository<Contact, String> {
}
