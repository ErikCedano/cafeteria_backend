package com.cafeteria.pos_backend.service;

import com.cafeteria.pos_backend.model.Category;
import com.cafeteria.pos_backend.model.Product;
import com.cafeteria.pos_backend.model.ProductVariant;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private List<Product> products;
    private List<ProductVariant> variants;
    private List<Category> categories;

    public ProductService() {
        initializeFakeData();
    }

    public List<Product> getAllProducts() {
        return products.stream().map(product -> {
            Product p = new Product();
            p.setId(product.getId());
            p.setName(product.getName());
            p.setDescription(product.getDescription());
            p.setCategoryId(product.getCategoryId());
            p.setUnitOfMeasure(product.getUnitOfMeasure());
            p.setHasVariants(product.getHasVariants());
            p.setIsActive(product.getIsActive());
            p.setImageUrl(product.getImageUrl());
            p.setCreatedAt(product.getCreatedAt());


            List<ProductVariant> productVariants = variants.stream()
                    .filter(v -> v.getProductId().equals(product.getId()))
                    .collect(Collectors.toList());
            p.setVariants(productVariants);

            return p;
        }).collect(Collectors.toList());
    }

    public Product getProductById(Integer id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .map(product -> {
                    Product p = new Product();
                    p.setId(product.getId());
                    p.setName(product.getName());
                    p.setDescription(product.getDescription());
                    p.setCategoryId(product.getCategoryId());
                    p.setUnitOfMeasure(product.getUnitOfMeasure());
                    p.setHasVariants(product.getHasVariants());
                    p.setIsActive(product.getIsActive());
                    p.setImageUrl(product.getImageUrl());
                    p.setCreatedAt(product.getCreatedAt());

                    List<ProductVariant> productVariants = variants.stream()
                            .filter(v -> v.getProductId().equals(product.getId()))
                            .collect(Collectors.toList());
                    p.setVariants(productVariants);

                    return p;
                })
                .orElse(null);
    }

    public List<Category> getAllCategories() {
        return new ArrayList<>(categories);
    }

    public Category getCategoryById(String id) {
        return categories.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    private void initializeFakeData() {
        categories = new ArrayList<>();
        categories.add(new Category("1", "Bebidas", "Bebidas calientes y frías", null, true, 1));
        categories.add(new Category("2", "Café", "Variedades de café", "1", true, 1));
        categories.add(new Category("3", "Té", "Variedades de té", "1", true, 2));
        categories.add(new Category("4", "Postres", "Postres y dulces", null, true, 2));
        categories.add(new Category("5", "Pasteles", "Pasteles enteros y rebanadas", "4", true, 1));
        categories.add(new Category("6", "Galletas", "Galletas artesanales", "4", true, 2));

        products = new ArrayList<>();
        products.add(new Product(1, "Café Americano", "Café americano preparado con granos selectos",
                "2", "pieza", true, true, "https://images.unsplash.com/photo-1509042239860-f550ce710b93?w=400",
                null, LocalDateTime.now()));
        products.add(new Product(2, "Latte", "Café latte con leche vaporizada",
                "2", "pieza", true, true, "https://images.unsplash.com/photo-1561882468-9110e03e0f78?w=400",
                null, LocalDateTime.now()));
        products.add(new Product(3, "Cappuccino", "Cappuccino con espuma de leche",
                "2", "pieza", true, true, "https://images.unsplash.com/photo-1572442388796-11668a67e53d?w=400",
                null, LocalDateTime.now()));
        products.add(new Product(7, "Pastel de Chocolate", "Delicioso pastel de chocolate",
                "5", "rebanada", false, true, "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400",
                null, LocalDateTime.now()));

        variants = new ArrayList<>();
        variants.add(new ProductVariant(1, 1, "Chico", "CAF-AME-CH", 45.0, 15.0, 0.16, true, 100));
        variants.add(new ProductVariant(2, 1, "Mediano", "CAF-AME-MD", 55.0, 20.0, 0.16, true, 100));
        variants.add(new ProductVariant(3, 1, "Grande", "CAF-AME-GR", 65.0, 25.0, 0.16, true, 100));
        variants.add(new ProductVariant(4, 2, "Chico", "CAF-LAT-CH", 55.0, 20.0, 0.16, true, 100));
        variants.add(new ProductVariant(5, 2, "Mediano", "CAF-LAT-MD", 65.0, 25.0, 0.16, true, 100));
        variants.add(new ProductVariant(6, 2, "Grande", "CAF-LAT-GR", 75.0, 30.0, 0.16, true, 100));
        variants.add(new ProductVariant(7, 3, "Chico", "CAF-CAP-CH", 50.0, 18.0, 0.16, true, 100));
        variants.add(new ProductVariant(8, 3, "Mediano", "CAF-CAP-MD", 60.0, 23.0, 0.16, true, 100));
        variants.add(new ProductVariant(9, 3, "Grande", "CAF-CAP-GR", 70.0, 28.0, 0.16, true, 100));
        variants.add(new ProductVariant(19, 7, "Rebanada", "PAS-CHO-REB", 65.0, 25.0, 0.16, true, 24));
    }
}