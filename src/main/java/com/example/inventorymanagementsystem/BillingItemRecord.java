package com.example.inventorymanagementsystem;


public class BillingItemRecord {
    private int itemID;
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private int totalPrice;
    private String category;

    public BillingItemRecord(int itemID, String itemName, int itemPrice, String category, int itemQuantity, int totalPrice ){
        this.itemID=itemID;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.itemQuantity=itemQuantity;
        this.category=category;
        this.totalPrice=totalPrice;
    }

    public int getItemID(){
        return itemID;
    }

    public void setItemID(int itemID){
        this.itemID=itemID;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName=itemName;
    }

    public int getItemPrice(){
        return itemPrice;
    }

    public void setItemPrice(int itemPrice){
        this.itemPrice=itemPrice;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity){
        this.itemQuantity=itemQuantity;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category=category;
    }


    public int getTotalPrice(){
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice=totalPrice;
    }
}
