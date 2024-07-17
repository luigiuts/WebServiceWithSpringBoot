package com.uts.zoo.respositories;

import org.springframework.data.repository.CrudRepository;

import com.uts.zoo.respositories.entities.SpecieEntity;

public interface SpecieRepository extends CrudRepository<SpecieEntity,Long>{
    
}
