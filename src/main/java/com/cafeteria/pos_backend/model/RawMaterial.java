package com.cafeteria.pos_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "rawMaterial")
@Data
public class RawMaterial {
    @Id
    private String id;
    private String name;
    private String description;
    private String category;
    private String unit;
    private Double stock;
    private Double minStock;
    private Double cost;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Double getMinStock() {
        return minStock;
    }

    public void setMinStock(Double minStock) {
        this.minStock = minStock;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public RawMaterial(String id, String name, String description, String category, String unit, Double stock, Double minStock, Double cost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.unit = unit;
        this.stock = stock;
        this.minStock = minStock;
        this.cost = cost;
    }

    public RawMaterial() {
    }
}