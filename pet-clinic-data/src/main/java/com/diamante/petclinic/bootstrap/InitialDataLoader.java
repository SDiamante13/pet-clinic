package com.diamante.petclinic.bootstrap;

import com.diamante.petclinic.entity.Owner;
import com.diamante.petclinic.entity.Vet;
import com.diamante.petclinic.service.OwnerService;
import com.diamante.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialDataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public InitialDataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = Owner.builder()
                .id(1L)
                .firstName("Chuck")
                .lastName("Norris")
                .build();

        Owner owner2 = Owner.builder()
                .id(2L)
                .firstName("Paul")
                .lastName("Jones")
                .build();

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Loading owners...");

        Vet vet1 = Vet.builder()
                .firstName("Sam")
                .lastName("Shields")
                .build();

        Vet vet2 = Vet.builder()
                .firstName("Tim")
                .lastName("Allen")
                .build();

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Loading vets...");
    }
}
