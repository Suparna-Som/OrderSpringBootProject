package com.order.OrderSpringBootProject.Controller;

import com.order.OrderSpringBootProject.Model.OrderDetailModel;
import com.order.OrderSpringBootProject.Services.OrderDetailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class OrderDetailController {

    OrderDetailServices orderDetailServices= new OrderDetailServices();
    @PostMapping("/savedetail")
    public OrderDetailModel saveOrderDetails(@ModelAttribute OrderDetailModel orderDetailModel){
         OrderDetailModel ordDetail = orderDetailServices.saveOrderDetails(orderDetailModel);
         return ordDetail;

    }
    @GetMapping("/showdetail")
            public void showOrderDetail()
    {
     orderDetailServices.select_fun();
    }
    @PutMapping("/updatedetails")
    public OrderDetailModel update(@ModelAttribute OrderDetailModel orderDetailModel) throws IOException {
        OrderDetailModel updatedetail = orderDetailServices.update_func(orderDetailModel);
        return updatedetail;
    }

}
