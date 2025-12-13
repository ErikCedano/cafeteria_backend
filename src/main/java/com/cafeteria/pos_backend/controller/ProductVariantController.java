package com.cafeteria.pos_backend.controller;


import com.cafeteria.pos_backend.model.ProductVariant;
import com.cafeteria.pos_backend.service.ProductVariantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product_variant")
public class ProductVariantController {

    @Autowired
    private ProductVariantServices productVariantServices;

    public ProductVariantController(ProductVariantServices productVariantServices){
        this.productVariantServices = productVariantServices;
    }
    @GetMapping
    public List<ProductVariant> getAll(){
        return productVariantServices.findAll();
    }

    @GetMapping("{id}")
    public ProductVariant getById(@PathVariable String id){
        return productVariantServices.findById(id);
    }

    @PostMapping
    public ProductVariant create(@PathVariable ProductVariant productVariant){
        return productVariantServices.save(productVariant);
    }

    @PutMapping
    public ProductVariant update(@PathVariable Integer id, @PathVariable ProductVariant productVariant){
        productVariant.setId(id);
        return productVariantServices.save(productVariant);
    }

    @DeleteMapping("{id}")
    public void  delete(@PathVariable String id){
        productVariantServices.delete(id);
    }


}
