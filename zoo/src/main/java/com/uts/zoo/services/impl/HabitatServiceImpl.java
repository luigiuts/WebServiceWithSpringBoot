package com.uts.zoo.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uts.zoo.respositories.HabitatRepository;
import com.uts.zoo.respositories.ZooRepository;
import com.uts.zoo.respositories.entities.HabitatEntity;
import com.uts.zoo.respositories.entities.ZooEntity;
import com.uts.zoo.services.HabitatService;

@Service
public class HabitatServiceImpl implements HabitatService {

    @Autowired
    private HabitatRepository habitatRespository;

    @Autowired
    private ZooRepository zooRepository;

    @Override
    public HabitatEntity save(HabitatEntity habitat, Long idZoo) {

        Optional<ZooEntity> zooOptional = zooRepository.findById(idZoo);

        if (zooOptional.isPresent()) {
            ZooEntity zooEntity = zooOptional.get();
            habitat.setZoo(zooEntity);
            habitatRespository.save(habitat);

            return habitat;

        } else {
            throw new NullPointerException("Zoologico no existe en la base datos");

        }
    }

}
