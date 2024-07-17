package com.example.PruebaFinal.repositories;
import org.springframework.data.repository.CrudRepository;

import com.example.PruebaFinal.repositories.entities.InmuebleEntity;

public interface InmuebleRepository extends CrudRepository<InmuebleEntity,Long>{
    
}