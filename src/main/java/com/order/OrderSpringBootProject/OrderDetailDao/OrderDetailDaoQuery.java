package com.order.OrderSpringBootProject.OrderDetailDao;

public class OrderDetailDaoQuery {
    public final String select = "Select * from order1";
    public final String insert = "insert into order1(order_id,cust_id,order_date,dilvery_date,qty,rate,amount,status) values(?,?,?,?,?,?,?,?)";
    public final String update = "Update order1 set status = ? where order_id =?";
    public final String delete = "DELETE FROM Inventory.Order1  WHERE order_id=?";
}
