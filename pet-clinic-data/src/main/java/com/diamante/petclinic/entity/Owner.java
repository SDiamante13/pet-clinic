package com.diamante.petclinic.entity;

import lombok.Builder;

public class Owner extends Person {

    @Builder
    public Owner(Long id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }
}
