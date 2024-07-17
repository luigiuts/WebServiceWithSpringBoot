package com.uts.zoo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uts.zoo.respositories.ZooRepository;
import com.uts.zoo.respositories.entities.ZooEntity;
import com.uts.zoo.services.ZooService;



@Service
public class ZooServiceImpl implements ZooService{

    @Autowired
    private ZooRepository zooRepository;

    @Override
    @Transactional(readOnly = true)
    public ZooEntity findById(Long id) {
        return zooRepository.findById(id).orElse(null);
    }
     
}
