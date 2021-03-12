package com.example.demo.dominio;

import java.math.BigDecimal;

public class BankAccount {

    private Long id;
    private BigDecimal balance;

    // Constructor

    public boolean withdraw(BigDecimal amount) {
        if(balance.compareTo(amount) < 0) {
            return false;
        }

        balance = balance.subtract(amount);
        return true;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

}