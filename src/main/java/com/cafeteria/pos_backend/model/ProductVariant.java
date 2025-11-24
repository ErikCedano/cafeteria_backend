package com.cafeteria.pos_backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductVariant {
    public ProductVariant(String id, String productId, String variantName, String sku, Double price, Double cost, Double taxRate, Boolean isActive, Integer stock) {
        this.id = id;
        this.productId = productId;
        this.variantName = variantName;
        this.sku = sku;
        this.price = price;
        this.cost = cost;
        this.taxRate = taxRate;
        this.isActive = isActive;
        this.stock = stock;
    }

    private String id;
    private String productId;
    private String variantName;
    private String sku;
    private Double price;
    private Double cost;
    private Double taxRate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    private Boolean isActive;
    private Integer stock;

}
