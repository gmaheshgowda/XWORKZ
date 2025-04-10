package com.xworkz.assingment.bankingsystem;

public class Bank {
    double amount;
    double balance;
    String bankName;

    public void debit(double amount)
    {
        this.balance -= amount;
        System.out.println("your current balance is :"+balance);
    }
    public void credit(double amount)
    {
        this.balance += amount;
        System.out.println("your current balance is :"+balance);

    }
}
