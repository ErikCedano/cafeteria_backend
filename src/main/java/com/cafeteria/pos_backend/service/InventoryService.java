package com.cafeteria.pos_backend.service;

import com.cafeteria.pos_backend.model.RawMaterial;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventoryService {

    private List<RawMaterial> rawMaterials;

    public InventoryService() {
        initializeFakeData();
    }

    public List<RawMaterial> getAllRawMaterials() {
        return new ArrayList<>(rawMaterials);
    }

    public RawMaterial getRawMaterialById(String id) {
        return rawMaterials.stream()
                .filter(rm -> rm.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<RawMaterial> getLowStockMaterials() {
        return rawMaterials.stream()
                .filter(rm -> rm.getStock() <= rm.getMinStock())
                .collect(Collectors.toList());
    }

    public List<RawMaterial> getRawMaterialsByCategory(String category) {
        return rawMaterials.stream()
                .filter(rm -> rm.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    private void initializeFakeData() {
        rawMaterials = new ArrayList<>();
        rawMaterials.add(new RawMaterial("rm1", "Café en Grano Arábica",
                "Café premium de origen colombiano", "Café", "kg", 15.0, 5.0, 450.0));
        rawMaterials.add(new RawMaterial("rm2", "Café Molido",
                "Café molido para espresso", "Café", "kg", 8.0, 3.0, 380.0));
        rawMaterials.add(new RawMaterial("rm3", "Leche Entera",
                "Leche fresca pasteurizada", "Lácteos", "litros", 25.0, 10.0, 22.0));
        rawMaterials.add(new RawMaterial("rm4", "Leche Deslactosada",
                "Leche sin lactosa", "Lácteos", "litros", 12.0, 5.0, 28.0));
        rawMaterials.add(new RawMaterial("rm5", "Crema para Batir",
                "Crema para cappuccino", "Lácteos", "litros", 8.0, 3.0, 65.0));
        rawMaterials.add(new RawMaterial("rm6", "Azúcar Blanca",
                "Azúcar refinada", "Endulzantes", "kg", 20.0, 5.0, 25.0));
        rawMaterials.add(new RawMaterial("rm7", "Splenda",
                "Endulzante artificial", "Endulzantes", "cajas", 15.0, 5.0, 85.0));
        rawMaterials.add(new RawMaterial("rm9", "Jarabe de Vainilla",
                "Saborizante para bebidas", "Saborizantes", "litros", 4.0, 2.0, 180.0));
        rawMaterials.add(new RawMaterial("rm12", "Té Verde en Hojas",
                "Té verde premium", "Té", "kg", 3.0, 1.0, 350.0));
        rawMaterials.add(new RawMaterial("rm14", "Harina de Trigo",
                "Harina para repostería", "Repostería", "kg", 30.0, 10.0, 18.0));
        rawMaterials.add(new RawMaterial("rm20", "Vasos 8oz",
                "Vasos de papel chicos", "Desechables", "piezas", 500.0, 100.0, 0.8));
    }
}