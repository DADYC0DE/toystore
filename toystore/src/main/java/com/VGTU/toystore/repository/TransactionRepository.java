package com.VGTU.toystore.repository;

import com.VGTU.toystore.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Custom queries can be added here if necessary
}
