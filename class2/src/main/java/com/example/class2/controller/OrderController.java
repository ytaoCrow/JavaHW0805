package com.example.class2.controller;

import com.example.class2.dao.Order;
import com.example.class2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

//get all orders
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping()
    public List<Order> getAllOrders() {

        List<Order> orderList = this.orderService.getAllOrders();
        return orderList;
    }

    //get order id
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        Order order = this.orderService.getOrderById(id);

        return order;
    }

    //post orders
    @PostMapping()
    public Order createdOrder(@RequestBody Order order) {
        Order createdOrder = this.orderService.createOrder(order);
        return createdOrder;
    }
    //put order by id
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable int id,@RequestBody Order order) {

        Order updateOrder = this.orderService.updateOrder(id, order);

        return updateOrder;
    }
    //delete order by id
    @DeleteMapping("/{id}")
    public Order deleteOrder(@PathVariable int id) {

        Order deletedOrder = this.orderService.deleteOrder(id);

        return deletedOrder;
    }

}
