package com.cafeteria.pos_backend.controller;

import com.cafeteria.pos_backend.model.Category;
import com.cafeteria.pos_backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("{id}")
    public Category category(String id){
        return categoryService.findById(id);
    }

    @PostMapping
    public Category update(@PathVariable String id, @PathVariable Category category){
        category.setId(id);
        return categoryService.save(category);
    }

    @DeleteMapping
    public void delete(@PathVariable String id){
        categoryService.delete(id);
    }

}
