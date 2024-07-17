package com.Parcial.Inmobiliaria.Service;

import java.util.List;

import com.Parcial.Inmobiliaria.Dto.InmuebleDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.InmuebleEntity;
import com.Parcial.Inmobiliaria.Repository.Entity.OficinaEntity;

public interface OficinaService {
    OficinaEntity save(OficinaEntity oficina);

    OficinaEntity findById(Long id);

    List<OficinaEntity> findAll();
    
    List<OficinaEntity> findAllDisponible();
    
    OficinaEntity update(Long id, OficinaEntity oficina);

    void deleteById(Long id);
}
