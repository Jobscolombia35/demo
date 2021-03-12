package com.example.demo.dominio.ports.ioutput;




import com.example.demo.dominio.BankAccount;

import java.util.Optional;

public interface LoadAccountPort {
    Optional<BankAccount> load(Long id);
}