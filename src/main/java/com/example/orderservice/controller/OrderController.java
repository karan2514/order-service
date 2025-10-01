package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public List<Order> getAllOrders() {
        return Arrays.asList(
                new Order(1L, "Laptop", 2),
                new Order(2L, "Phone", 5)
        );
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return new Order(id, "Sample Item", 1);
    }
}