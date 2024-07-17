package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Repository.Entity.OfertaEntity;

@Repository
public interface OfertaRepository extends CrudRepository<OfertaEntity, Long> {
    
}