package com.diamante.petclinic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class BaseEntity implements Serializable {
    private Long id;
}
