package com.diamante.petclinic.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    LocalDate birthDate;

    @Builder
    public Pet(Long id, PetType petType, Owner owner, LocalDate birthDate) {
        super(id);
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }
}
