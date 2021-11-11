package com.order.OrderSpringBootProject.Services;

import com.order.OrderSpringBootProject.Model.OrderDetailModel;
import com.order.OrderSpringBootProject.Repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServices {
    @Autowired
    OrderDetailRepository orderDetailRepository;
    public OrderDetailModel saveOrderDetails(OrderDetailModel orderDetailModel){
        return orderDetailRepository.save(orderDetailModel);
    }
}
