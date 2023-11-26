package com.demo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.entities.Order;
import com.demo.demo.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Order findById(Long id) {
        Optional<Order> result = orderRepository.findById(id);
        return result.get();
    }
}
