package com.eproject.Cinema.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eproject.Cinema.repositories.OrderRepository;

@Service
public class OrderService {
      @Autowired
      OrderRepository _orderRepository;
}