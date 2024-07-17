package com.example.PruebaFinal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.PruebaFinal.repositories.entities.ClienteEntity;

public interface ClienteRepository extends CrudRepository<ClienteEntity,Long>{
    
}
