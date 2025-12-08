package com.cafeteria.pos_backend.controller;

import com.cafeteria.pos_backend.model.Product;

import java.util.List;

public interface LocalController {

    List<Product> findallLocals();
    Product saveProduct(Product product);
    Product updateProduct(Product id, Product product);
    void deleteProduct(Integer id);
}
