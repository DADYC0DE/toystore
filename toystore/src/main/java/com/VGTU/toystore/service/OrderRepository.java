package com.VGTU.toystore.service;

import com.VGTU.toystore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // No need to manually define findAll() or save() as they are provided by JpaRepository
}
