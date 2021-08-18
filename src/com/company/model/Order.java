package com.company.model;
import java.util.Map;

public class Order {
    String customerName;
    String phoneNumber;
    String Address;

    public String getTotalPrice() {
        return totalPrice;
    }

    String totalPrice;

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public Order(String customerName, String phoneNumber, String address, String totalPrice, Map<Drug, Integer> productAndQuantity) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        Address = address;
        this.totalPrice = totalPrice;
        ProductAndQuantity = productAndQuantity;
    }

    public Map<Drug, Integer> getProductAndQuantity() {
        return ProductAndQuantity;
    }

    Map<Drug, Integer> ProductAndQuantity;


}
