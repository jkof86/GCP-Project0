package com.revature.models;

public interface Account {
    int accountNumber = 0;
    String accountType = null;
    float interest = 0;


    public void deposit();
    public void withdraw();
    public void transfer();
    public String getType();

}
