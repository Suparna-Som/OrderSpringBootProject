package com.order.OrderSpringBootProject.Services;

import com.order.OrderSpringBootProject.Connection.JDBCconnection;
import com.order.OrderSpringBootProject.Model.OrderDetailModel;

import com.order.OrderSpringBootProject.OrderDetailDao.OrderDetailDaoQuery;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.*;

@Service
public class OrderDetailServices {

    JDBCconnection jdbCconnection = new JDBCconnection();
    Connection connection;
    OrderDetailDaoQuery orderDetailDaoQuery = new OrderDetailDaoQuery();
    PreparedStatement stmt = null;
    OrderDetailModel orderDetailModel;
    public OrderDetailModel saveOrderDetails(OrderDetailModel orderDetailModel){

        try {

            connection = jdbCconnection.connect();
            PreparedStatement stmt = connection.prepareStatement(orderDetailDaoQuery.insert);
            stmt.setInt(1,orderDetailModel.getOrder_id());
            stmt.setString(2, orderDetailModel.getCust_id());;
            stmt.setString(3, orderDetailModel.getOrder_date());
            stmt.setString(4, orderDetailModel.getDilvery_date());
            stmt.setInt(5, orderDetailModel.getQty());
            stmt.setInt(6, orderDetailModel.getRate());
            stmt.setInt(7, orderDetailModel.getAmount());
            stmt.setString(8, orderDetailModel.getStatus());

            stmt.executeUpdate();
            System.out.println("Records inserted successfully");
            connection.close();
            System.out.println("Connection closed");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return orderDetailModel;
    }
    public void select_fun() {
        try {
            connection = jdbCconnection.connect();
            Statement stmt = connection.createStatement();
            ResultSet result = stmt.executeQuery(orderDetailDaoQuery.select);
            while (result.next()) {
                System.out.println(result.getString("Order_Id") + " show detail" + result.getString("Cust_Id") + " " + result.getString("Order_Date") + " " + result.getString("Dilvery_Date") + " " + result.getString("Qty") + " " + result.getInt("Rate") + " " + result.getInt("Amount") + " " + result.getString("Status"));
            }
            connection.close();
            System.out.println("Connection closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public OrderDetailModel update_func(OrderDetailModel orderDetailModel) throws IOException {

        try {

            connection = jdbCconnection.connect();
            PreparedStatement stmt = connection.prepareStatement(orderDetailDaoQuery.update);
            stmt.setInt(1,  orderDetailModel.getOrder_id());
            stmt.setString(2, (orderDetailModel.getStatus()));
            stmt.executeUpdate();
            System.out.println("Successfully updated");
            connection.close();
            System.out.println("Connection closed");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return orderDetailModel;
    }
    }

