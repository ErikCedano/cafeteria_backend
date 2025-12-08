package com.cafeteria.pos_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "categoria")
@Data
public class Category {

    @Id
    private String id;
    private String name;
    private String description;
    private String parentId;
    private Boolean isActive;
    private Integer diplayOrder;

    public Category(String id, String name, String description, String parentId, Boolean isActive, Integer diplayOrder) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.parentId = parentId;
        this.isActive = isActive;
        this.diplayOrder = diplayOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getDiplayOrder() {
        return diplayOrder;
    }

    public void setDiplayOrder(Integer diplayOrder) {
        this.diplayOrder = diplayOrder;
    }
}
