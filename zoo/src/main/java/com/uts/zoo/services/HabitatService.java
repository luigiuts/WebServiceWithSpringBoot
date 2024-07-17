package com.uts.zoo.services;

import com.uts.zoo.respositories.entities.HabitatEntity;

public interface HabitatService {

    HabitatEntity save(HabitatEntity habitat, Long idZoo);
    
}