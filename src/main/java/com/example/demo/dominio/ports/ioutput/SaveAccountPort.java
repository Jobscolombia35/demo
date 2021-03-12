package com.example.demo.dominio.ports.ioutput;


import com.example.demo.dominio.BankAccount;

public interface SaveAccountPort {
    void save(BankAccount bankAccount);
}