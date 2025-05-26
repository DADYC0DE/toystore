package com.VGTU.toystore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface wishlistRepository extends JpaRepository<com.VGTU.toystore.model.Wishlist, Long> {
    // Custom queries can be added here if necessary
}
