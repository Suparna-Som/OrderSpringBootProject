package com.order.OrderSpringBootProject.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order1")
public class OrderDetailModel {
    @Id
    @GeneratedValue
    private int order_id;
    private String cust_id;
    private String order_date;
    private String dilvery_date;
    private int qty;
    private int rate;
    private int amount;
    private String status;

    public OrderDetailModel() {
        super();
    }

    public OrderDetailModel(int order_id, String cust_id, String order_date, String dilvery_date, int qty, int rate, int amount, String status) {
        this.order_id = order_id;
        this.cust_id = cust_id;
        this.order_date = order_date;
        this.dilvery_date = dilvery_date;
        this.qty = qty;
        this.rate = rate;
        this.amount = amount;
        this.status = status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getDilvery_date() {
        return dilvery_date;
    }

    public void setDilvery_date(String dilvery_date) {
        this.dilvery_date = dilvery_date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}