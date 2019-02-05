package com.diamante.petclinic.entity;

import lombok.Data;

@Data
public class PetType extends BaseEntity {
    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}
