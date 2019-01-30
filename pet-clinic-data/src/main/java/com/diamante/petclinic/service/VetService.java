package com.diamante.petclinic.service;

import com.diamante.petclinic.entity.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
