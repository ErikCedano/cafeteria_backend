package com.cafeteria.pos_backend.controller;

import com.cafeteria.pos_backend.model.Product_images;
import com.cafeteria.pos_backend.service.ProductImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product_image")
public class ProductImagesController {

    @Autowired
    private ProductImagesService productImgService;

    public ProductImagesController(ProductImagesService productImgService){
        this.productImgService = productImgService;
    }

    @GetMapping
    public List<Product_images> getAll(){
        return productImgService.findAll();
    }

    @GetMapping("{id}")
    public Product_images getById(@PathVariable String id){
        return productImgService.findById(id);
    }

    @PostMapping
    public  Product_images create (@RequestBody Product_images product_images){
        return productImgService.save(product_images);
    }

    @PutMapping("/{id}")
    public Product_images update(@PathVariable Integer id, @RequestBody Product_images product_images){
        return productImgService.save(product_images);
    }

    public void delete(@PathVariable String id){
        productImgService.delete(id);
    }


}
