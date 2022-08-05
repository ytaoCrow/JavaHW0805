package com.example.class2.service;

import com.example.class2.dao.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderService{

//全部訂單
    protected List<Order> orderList;
    public OrderService (){
        this.orderList = new ArrayList<>();

        MealHelper mealService1 = new MealHelper(new ArrayList<>());
        this.orderList.add(new Order(1,3000, "Bill", mealService1.getMealList()));

        MealHelper mealService2 = new MealHelper(new ArrayList<>());
        this.orderList.add(new Order(2,4000, "Justin", mealService2.getMealList()));
    }
    public List<Order> getAllOrders() {

        return orderList;
    }

    //查詢特定訂單
    public Order getOrderById(int id) {
        for(Order order : this.orderList){
            if(id == order.getSeq()){
                return order;
            }
        }
        return null;
    }
    //新增訂單
        public Order createOrder(@PathVariable Order order) {
        this.orderList.add(order);
        return order;
    }
    //修改訂單
    public Order updateOrder(int id,Order order) {

        for(Order updateOrder : this.orderList) {

            if (id == updateOrder.getSeq()) {
                updateOrder.setSeq(order.getSeq());
                updateOrder.setTotalPrice(order.getTotalPrice());
                updateOrder.setWaiter(order.getWaiter());
                updateOrder.setMealList(order.getMealList());
                return updateOrder;

            }
        }
        return null;
    }

    //刪除訂單
    public Order deleteOrder(int id) {
        for (Order order : this.orderList){
            if (id == order.getSeq()){
                this.orderList.remove(order);
                return order;
            }
        }

        return null;
    }
}//Class end;
