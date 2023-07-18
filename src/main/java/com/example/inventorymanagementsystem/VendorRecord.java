package com.example.inventorymanagementsystem;

public class VendorRecord {
    private String name;
    private String email;
    private String password;
    private long phoneNumber;
    private String gender;
    private String country;

    public VendorRecord (String name, String email, String password, long phoneNumber, String gender, String country){
        this.name=name;
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.country=country;
    }

    public String getName (){
        return name;
    }
    public void setName(String name1){
        name=name1;
    }

    public String getEmail (){
        return email;
    }
    public void setEmail(String email1){
        email=email1;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password1){
        password=password1;
    }

    public long getPhoneNumber (){
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber1){
        phoneNumber=phoneNumber1;
    }

    public String getGender (){
        return gender;
    }

    public void setgender(String gender1){
        gender=gender1;
    }

    public String getCountry (){
        return country;
    }
    public void setCountry(String country1){
        country=country1;
    }
}

