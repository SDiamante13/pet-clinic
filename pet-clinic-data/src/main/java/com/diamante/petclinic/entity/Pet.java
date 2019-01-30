package com.diamante.petclinic.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;

@Data
public class Pet {
    private PetType petType;
    private Owner owner;
    LocalDate birthDate;
}
