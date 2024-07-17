package com.uts.zoo.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uts.zoo.respositories.AnimalRespository;
import com.uts.zoo.respositories.SpecieRepository;
import com.uts.zoo.respositories.ZooRepository;
import com.uts.zoo.respositories.entities.AnimalEntity;
import com.uts.zoo.respositories.entities.SpecieEntity;
import com.uts.zoo.respositories.entities.ZooEntity;    
import com.uts.zoo.services.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRespository animalRespository;

    @Autowired
    private ZooRepository zooRepository;

    @Autowired
    private SpecieRepository specieRepository;

    @Override
    public AnimalEntity save(AnimalEntity animal, Long idZoo, Long idEspecie)  {
         
        Optional<ZooEntity> zooOptional=zooRepository.findById(idZoo);
        Optional<SpecieEntity> specieOptional=specieRepository.findById(idEspecie);

        if(zooOptional.isPresent() && specieOptional.isPresent()){
           ZooEntity zooEntity=zooOptional.get();
           SpecieEntity specieEntity=specieOptional.get();
           animal.setZoo(zooEntity);           
           animal.setEspecie(specieEntity);          
           animalRespository.save(animal);
         
           return animal;

        }else{
         throw new NullPointerException("Zoologico o especie no existe en la base datos");
        
        }
        

    }
    
}
