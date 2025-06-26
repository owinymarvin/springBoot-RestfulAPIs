package com.dmarv.restfulAPIs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("customerName") //should match the name sent from postman or the frontEnd
    private String customerName;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("quantity")
    private int quantity;

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
