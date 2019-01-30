package com.diamante.petclinic.service;

import com.diamante.petclinic.entity.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
