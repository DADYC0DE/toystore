package com.VGTU.toystore.service;

import com.VGTU.toystore.repository.wishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class wishlistService {

    private final wishlistRepository wishlistRepository;

    @Autowired
    public wishlistService(wishlistRepository wishlistRepository) {
        this.wishlistRepository = wishlistRepository;
    }

    public List<com.VGTU.toystore.model.Wishlist> getAllWishlists() {
        return wishlistRepository.findAll();
    }

    public com.VGTU.toystore.model.Wishlist addWishlist(com.VGTU.toystore.model.Wishlist wishlist) {
        return wishlistRepository.save(wishlist);
    }

    public com.VGTU.toystore.model.Wishlist getWishlistById(Long id) {
        return wishlistRepository.findById(id).orElse(null);
    }
}
