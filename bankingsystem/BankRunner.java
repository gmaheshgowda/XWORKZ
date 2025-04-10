package com.xworkz.assingment.bankingsystem;

public class BankRunner {
    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.credit(5000.00);
        bank.debit(4500.83);

        CanaraBank canaraBank = new CanaraBank();
        canaraBank.debit(767.00);

    }
}