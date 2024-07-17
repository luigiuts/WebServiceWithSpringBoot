package com.uts.zoo.services;

import com.uts.zoo.respositories.entities.AnimalEntity;

public interface AnimalService {

    AnimalEntity save(AnimalEntity animal, Long idZoo, Long idEspecie);
   
}
