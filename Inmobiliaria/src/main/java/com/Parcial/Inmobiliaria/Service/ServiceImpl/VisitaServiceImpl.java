package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Parcial.Inmobiliaria.Dto.VisitaDTO;
import com.Parcial.Inmobiliaria.Dto.Convert.VisitaDTOConvert;
import com.Parcial.Inmobiliaria.Repository.VisitaRepository;
import com.Parcial.Inmobiliaria.Repository.Entity.VisitaEntity;
import com.Parcial.Inmobiliaria.Service.VisitaService;

@Service
public class VisitaServiceImpl implements VisitaService{

    @Autowired
    private VisitaRepository visitaRepository;

    @Autowired
    private VisitaDTOConvert visitaDTOConvert;


    @Override
    public VisitaEntity save(VisitaEntity cliente) {
        visitaRepository.save(cliente);
        if(cliente.getId()!=null){
            visitaRepository.save(cliente);
            return cliente;
        }else{
            throw new UnsupportedOperationException("Se guardo el cliente en la bd");
        }
    }
    
}
