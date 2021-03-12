package com.example.demo.dominio.ports.input;

import java.math.BigDecimal;

public interface DepositUseCase {
    void deposit(Long id, BigDecimal amount);
}