package com.cafeteria.pos_backend.service;

import com.cafeteria.pos_backend.model.Product_images;
import com.cafeteria.pos_backend.repository.ProductImagesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImagesService {

    private final ProductImagesRepository productImgRepository;

    public ProductImagesService(ProductImagesRepository productImgRepository) {
        this.productImgRepository = productImgRepository;
    }

    public List<Product_images> findAll(){
        return productImgRepository.findAll();
    }

    public Product_images findById(String id){
        return productImgRepository.findById(id).orElse(null);
    }

    public Product_images save(Product_images product_images){
        return productImgRepository.save(product_images);
    }

    public void delete(String id){
        productImgRepository.deleteById(id);
    }


}
