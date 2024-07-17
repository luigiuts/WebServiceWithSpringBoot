package com.uts.zoo.respositories;

import org.springframework.data.repository.CrudRepository;
import com.uts.zoo.respositories.entities.AnimalEntity;

public interface AnimalRespository extends CrudRepository<AnimalEntity,Long>{
    
}
