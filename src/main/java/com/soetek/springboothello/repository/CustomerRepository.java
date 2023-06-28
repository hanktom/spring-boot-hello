package com.soetek.springboothello.repository;

import com.soetek.springboothello.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
