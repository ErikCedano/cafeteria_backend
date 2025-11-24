package com.cafeteria.pos_backend.controller;

import com.cafeteria.pos_backend.model.RawMaterial;
import com.cafeteria.pos_backend.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/raw-materials")
    public ResponseEntity<List<RawMaterial>> getAllRawMaterials (){
        List<RawMaterial> materials = inventoryService.getAllRawMaterials();
        return ResponseEntity.ok(materials);
    }

    @GetMapping("/raw-materials/{id}")
    public ResponseEntity<RawMaterial> getRawMaterialById(@PathVariable String id){
        RawMaterial material = inventoryService.getRawMaterialById(id);
        if(material == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(material);
    }

    @GetMapping("/raw-materials/low-stock")
    public ResponseEntity<List<RawMaterial>> getLowStockMaterials(){
        List<RawMaterial> materials = inventoryService.getLowStockMaterials();
        return ResponseEntity.ok(materials);
    }

    @GetMapping("/raw-materials/category/{category}")
    public ResponseEntity<List<RawMaterial>> getRawMaterialsByCategory(@PathVariable String category) {
        List<RawMaterial> materials = inventoryService.getRawMaterialsByCategory(category);
        return ResponseEntity.ok(materials);
    }

}
