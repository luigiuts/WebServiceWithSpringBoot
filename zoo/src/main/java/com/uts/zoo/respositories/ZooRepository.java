package com.uts.zoo.respositories;

import org.springframework.data.repository.CrudRepository;

import com.uts.zoo.respositories.entities.ZooEntity;

public interface ZooRepository extends CrudRepository<ZooEntity,Long>{
    
}
