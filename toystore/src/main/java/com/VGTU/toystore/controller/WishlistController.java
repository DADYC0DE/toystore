package com.VGTU.toystore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.VGTU.toystore.service.wishlistService;

import java.util.List;

@RestController
@RequestMapping("/wishlists")
public class WishlistController {

    private final wishlistService wishlistService;

    @Autowired
    public WishlistController(wishlistService wishlistService) {
        this.wishlistService = wishlistService;
    }

    @GetMapping
    public List<com.VGTU.toystore.model.Wishlist> getAllWishlists() {
        return wishlistService.getAllWishlists();
    }

    @PostMapping
    public com.VGTU.toystore.model.Wishlist addWishlist(@RequestBody com.VGTU.toystore.model.Wishlist wishlist) {
        return wishlistService.addWishlist(wishlist);
    }

    @GetMapping("/{id}")
    public com.VGTU.toystore.model.Wishlist getWishlistById(@PathVariable Long id) {
        return wishlistService.getWishlistById(id);
    }
}
