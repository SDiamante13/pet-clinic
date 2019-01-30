package com.diamante.petclinic.entity;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class Person {
    private String firstName;
    private String lastName;

}
