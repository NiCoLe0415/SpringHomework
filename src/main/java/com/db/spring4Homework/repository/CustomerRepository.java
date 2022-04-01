package com.db.spring4Homework.repository;

import com.db.spring4Homework.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    Customer getById(Integer id);
}