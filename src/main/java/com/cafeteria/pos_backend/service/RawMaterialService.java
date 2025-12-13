package com.cafeteria.pos_backend.service;

import com.cafeteria.pos_backend.model.RawMaterial;
import com.cafeteria.pos_backend.repository.RawMaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialService {

    private RawMaterialRepository rawMarerialRepository;

    public RawMaterialService(RawMaterialRepository  rawMarerialRepository) {
        this.rawMarerialRepository = rawMarerialRepository;
    }

    public List<RawMaterial> findAll(){
        return rawMarerialRepository.findAll();
    }

    public RawMaterial findById(String id){
        return rawMarerialRepository.findById(id).orElse(null);
    }

    public RawMaterial save(RawMaterial rawMaterial){
        return rawMarerialRepository.save(rawMaterial);
    }

    public void delete(String id){
        rawMarerialRepository.deleteById(id);
    }
}
