package com.Parcial.Inmobiliaria.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Parcial.Inmobiliaria.Repository.Entity.CaracteristicasEntity;

@Repository
public interface CaracteristicasRepository extends CrudRepository<CaracteristicasEntity, Long> {
   
}
