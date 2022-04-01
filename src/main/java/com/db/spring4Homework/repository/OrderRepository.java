package com.db.spring4Homework.repository;

import com.db.spring4Homework.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order,Integer> {
    List<Order> getByCustomerId(Integer Id);
    List<Order> getAllByCustomerId(Integer id);
}