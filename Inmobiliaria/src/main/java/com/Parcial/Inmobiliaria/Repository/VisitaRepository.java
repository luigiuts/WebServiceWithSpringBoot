package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Repository.Entity.VisitaEntity;

@Repository
public interface VisitaRepository extends CrudRepository<VisitaEntity, Long> {
   
}
