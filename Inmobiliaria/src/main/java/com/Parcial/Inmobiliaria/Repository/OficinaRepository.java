package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Repository.Entity.OficinaEntity;

@Repository
public interface OficinaRepository extends CrudRepository<OficinaEntity, Long> {
   
}
