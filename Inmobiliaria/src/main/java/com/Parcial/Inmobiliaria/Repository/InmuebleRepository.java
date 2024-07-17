package com.Parcial.Inmobiliaria.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Repository.Entity.InmuebleEntity;

@Repository
public interface InmuebleRepository extends CrudRepository<InmuebleEntity, Long> {
    
}