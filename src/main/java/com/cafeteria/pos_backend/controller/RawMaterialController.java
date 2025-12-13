package com.cafeteria.pos_backend.controller;

import com.cafeteria.pos_backend.model.RawMaterial;
import com.cafeteria.pos_backend.service.RawMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/raw_material")
public class RawMaterialController {

    @Autowired
    private RawMaterialService rawMaterialService;

    public RawMaterialController(RawMaterialService rawMaterialService){
        this.rawMaterialService = rawMaterialService;
    }

    @GetMapping
    public List<RawMaterial> findAll(){
        return rawMaterialService.findAll();
    }

    @GetMapping("{id}")
    public RawMaterial getById(@PathVariable String id){
        return  rawMaterialService.findById(id);
    }

    @PostMapping
    public RawMaterial update(@PathVariable String id, @PathVariable RawMaterial rawMaterial){
        rawMaterial.setId(id);
        return rawMaterialService.save(rawMaterial);
    }

    public void delete(@PathVariable String id){
        rawMaterialService.delete(id);
    }

}
