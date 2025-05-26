package com.VGTU.toystore.repository;

import com.VGTU.toystore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Custom query methods can go here
    // Example: findByEmail, findByName, etc.
}
