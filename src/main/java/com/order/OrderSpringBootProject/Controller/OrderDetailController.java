package com.order.OrderSpringBootProject.Controller;

import com.order.OrderSpringBootProject.Model.OrderDetailModel;
import com.order.OrderSpringBootProject.Services.OrderDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderDetailController {
    @Autowired
    OrderDetailServices orderDetailServices;
    @PostMapping("/orderdetail")
    public OrderDetailModel saveOrderDetails(@ModelAttribute OrderDetailModel orderDetailModel){
         OrderDetailModel ordDetail = orderDetailServices.saveOrderDetails(orderDetailModel);
         return ordDetail;

    }
}
