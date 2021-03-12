package com.example.demo.dominio.ports.input;

import java.math.BigDecimal;

public interface WithdrawUseCase {
    boolean withdraw(Long id, BigDecimal amount);
}