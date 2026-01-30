package com.cafeteria.pos_backend.repository;

import com.cafeteria.pos_backend.model.Product_images;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImagesRepository extends JpaRepository<Product_images, String> {
}
