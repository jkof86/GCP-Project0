package com.revature.models;

import com.revature.models.Account;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phone;

    private Account type;

    public Customer(int id, String name, int age, String address, String phone, Account type){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.type = type;


        System.out.println("*** A new customer object was created ***");
        System.out.println("Account ID: " + id + " | " + name + " | " + type.getType());
    }
}
