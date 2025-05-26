package com.VGTU.toystore.repository;

import com.VGTU.toystore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // You can add custom queries if needed. For example:
    // List<Product> findByName(String name);
    // Product findById(Long id);
}

