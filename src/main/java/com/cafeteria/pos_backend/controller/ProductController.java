package com.cafeteria.pos_backend.controller;

import com.cafeteria.pos_backend.model.Category;
import com.cafeteria.pos_backend.model.Product;
import com.cafeteria.pos_backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(){
        Product product = new Product();
        if(product == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getAllCategories(){
        List<Category> categories = productService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable String id){
        Category category = productService.getCategoryById(id);
        if(category == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(category);

    }

}
