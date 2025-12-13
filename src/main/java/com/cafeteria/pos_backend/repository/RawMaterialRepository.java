package com.cafeteria.pos_backend.repository;

import com.cafeteria.pos_backend.model.RawMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RawMaterialRepository extends JpaRepository<RawMaterial, String> {
}
