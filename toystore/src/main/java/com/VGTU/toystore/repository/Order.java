package com.VGTU.toystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Order extends JpaRepository<com.VGTU.toystore.model.Order, Long> {
    // Custom queries can be added here if necessary
}
