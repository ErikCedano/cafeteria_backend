package com.cafeteria.pos_backend.repository;

import com.cafeteria.pos_backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
