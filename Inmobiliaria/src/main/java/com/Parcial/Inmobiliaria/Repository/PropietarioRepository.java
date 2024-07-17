package com.Parcial.Inmobiliaria.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Repository.Entity.PropietarioEntity;

@Repository
public interface PropietarioRepository extends CrudRepository<PropietarioEntity, Long> {
   
}
