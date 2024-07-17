package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Parcial.Inmobiliaria.Dto.InmuebleDTO;
import com.Parcial.Inmobiliaria.Dto.Convert.InmuebleDTOConvert;
import com.Parcial.Inmobiliaria.Repository.InmuebleRepository;
import com.Parcial.Inmobiliaria.Repository.Entity.InmuebleEntity;
import com.Parcial.Inmobiliaria.Service.InmuebleService;

import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService{

    @Autowired
    private InmuebleRepository inmuebleRepository;

    @Autowired
    private InmuebleDTOConvert inmuebleDTOConvert;

    @Override
    @Transactional
    public InmuebleDTO save(InmuebleDTO inmuebleDTO) {
        InmuebleEntity inmuebleEntity = inmuebleDTOConvert.convertInmuebleEntity(inmuebleDTO);
    
        InmuebleEntity savedInmuebleEntity = inmuebleRepository.save(inmuebleEntity);
    
        return inmuebleDTOConvert.convertInmuebleDTO(savedInmuebleEntity);
    }
    

    @Override
    @Transactional
    public InmuebleEntity findById(Long id) {
        return inmuebleRepository.findById(id).orElse(null);
    }

    @Override
    public List<InmuebleDTO> findAll() {
        List<InmuebleEntity> listInmuebleEntity = (List<InmuebleEntity>) inmuebleRepository.findAll();//Java 8 pa arriba
        return  listInmuebleEntity.stream()
        .map(x->inmuebleDTOConvert.convertInmuebleDTO(x))
        .toList();
    }
    
    @Override
    public List<InmuebleDTO> findAllDisponible() {
        List<InmuebleEntity> listInmuebleEntity = (List<InmuebleEntity>) inmuebleRepository.findAll();
    
        return listInmuebleEntity.stream()
                .filter(inmueble -> "DISPONIBLE".equals(inmueble.getEstado()))
                .map(inmuebleDTOConvert::convertInmuebleDTO)
                .toList();
    }
    

    @Override
    public InmuebleEntity update(Long id, InmuebleEntity inmueble) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
