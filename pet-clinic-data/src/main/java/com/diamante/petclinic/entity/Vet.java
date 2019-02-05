package com.diamante.petclinic.entity;

import lombok.Builder;

public class Vet extends Person {
    @Builder
    public Vet(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
