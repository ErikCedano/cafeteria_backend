package com.cafeteria.pos_backend.controller;

import com.cafeteria.pos_backend.model.Product;
import com.cafeteria.pos_backend.model.ProductVariant;
import com.cafeteria.pos_backend.model.RawMaterial;

import java.util.List;

public interface LocalController {

    List<Product> findallLocals();
    Product saveProduct(Product product);
    Product updateProduct(Product id, Product product);
    void deleteProduct(Integer id);

    List<ProductVariant> findAllLocalsVariant();
    ProductVariant saveProduct(ProductVariant productVariant);
    ProductVariant updateProduct(ProductVariant id, ProductVariant productVariant);
    void deleteProductVariant(Integer id);


    List<RawMaterial> findAllLocalsRaw();
    RawMaterial saveRaw(RawMaterial rawMaterial);
    RawMaterial updateRaw(RawMaterial id, RawMaterial rawMaterial);
    void deleteRawMaterial(Integer id);

}
