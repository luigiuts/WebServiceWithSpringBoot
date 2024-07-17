package com.uts.zoo.services;

import com.uts.zoo.respositories.entities.ZooEntity;

public interface ZooService {

    ZooEntity findById(Long id);
    
}
