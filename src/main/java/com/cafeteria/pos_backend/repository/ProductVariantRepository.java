package com.cafeteria.pos_backend.repository;

import com.cafeteria.pos_backend.model.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariantRepository extends JpaRepository<ProductVariant, String> {
}
