package com.cafeteria.pos_backend.repository;

import com.cafeteria.pos_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

    
}
