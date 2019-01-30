package com.diamante.petclinic.service;

import com.diamante.petclinic.entity.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
