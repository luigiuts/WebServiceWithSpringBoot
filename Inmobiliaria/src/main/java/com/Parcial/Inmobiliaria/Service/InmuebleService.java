package com.Parcial.Inmobiliaria.Service;

import java.util.List;

import com.Parcial.Inmobiliaria.Dto.InmuebleDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.InmuebleEntity;

public interface InmuebleService {
    InmuebleDTO save(InmuebleDTO inmueble);

    InmuebleEntity findById(Long id);

    List<InmuebleDTO> findAll();
    
    List<InmuebleDTO> findAllDisponible();
    
    InmuebleEntity update(Long id, InmuebleEntity inmueble);
}