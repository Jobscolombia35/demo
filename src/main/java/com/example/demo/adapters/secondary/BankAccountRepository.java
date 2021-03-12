package com.example.demo.adapters.secondary;

import com.example.demo.dominio.BankAccount;
import com.example.demo.dominio.ports.ioutput.LoadAccountPort;
import com.example.demo.dominio.ports.ioutput.SaveAccountPort;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BankAccountRepository implements LoadAccountPort, SaveAccountPort {

    private SpringDataBankAccountRepository repository;

    public BankAccountRepository(SpringDataBankAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<BankAccount> load(Long id) {
        return null;//repository.findById(id);
    }

    @Override
    public void save(BankAccount bankAccount) {
       // repository.save(bankAccount);
    }
}