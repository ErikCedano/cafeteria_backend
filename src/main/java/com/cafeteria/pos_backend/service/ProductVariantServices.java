package com.cafeteria.pos_backend.service;

import com.cafeteria.pos_backend.model.ProductVariant;
import com.cafeteria.pos_backend.repository.ProductVariantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductVariantServices {

    private final ProductVariantRepository productVariantRepository;

    public ProductVariantServices(ProductVariantRepository variantRepository ) {
        this.productVariantRepository = variantRepository;
    }

    public List<ProductVariant> findAll(){
        return  productVariantRepository.findAll();
    }

    public ProductVariant findById(String id) {
        return productVariantRepository.findById(id).orElse(null);
    }

    public ProductVariant save(ProductVariant productVariant){
        return productVariantRepository.save(productVariant);
    }

    public void delete(String id){
        productVariantRepository.deleteById(id);
    }

}
