package com.order.OrderSpringBootProject.Repository;

import com.order.OrderSpringBootProject.Model.OrderDetailModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends CrudRepository<OrderDetailModel,Integer> {

}
