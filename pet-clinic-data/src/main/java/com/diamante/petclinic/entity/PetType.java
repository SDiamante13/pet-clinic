package com.diamante.petclinic.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class PetType extends BaseEntity {
    private String name;
}
