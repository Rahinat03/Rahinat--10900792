package com.example.inventorymanagementsystem;

public class ItemRecord {
    private int itemID;
    private String itemName;
    private int itemPrice;
    private String itemCategory;
    private int itemQuantity;
    private String priceRange;

    public ItemRecord(int itemID, String itemName, int itemPrice, String itemCategory, String priceRange, int itemQuantity) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
        this.itemQuantity = itemQuantity;
        this.priceRange = priceRange;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return this.itemID;
    }

    public void setItemId(int itemID) {
        this.itemID = itemID;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return this.itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getPriceRange() {
        return this.priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }
}
