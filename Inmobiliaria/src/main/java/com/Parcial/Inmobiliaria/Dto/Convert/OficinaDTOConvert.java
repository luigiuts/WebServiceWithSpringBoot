package com.Parcial.Inmobiliaria.Dto.Convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Parcial.Inmobiliaria.Dto.OficinaDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.OficinaEntity;

@Component
public class OficinaDTOConvert {
    private final ModelMapper modelMapper;

    public OficinaDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public OficinaDTO convertOficinaDTO(OficinaEntity oficinaEntity) {
        return modelMapper.map(oficinaEntity, OficinaDTO.class);
    }

    public OficinaEntity convertOficinaEntity(OficinaDTO oficinaDTO) {
        return modelMapper.map(oficinaDTO, OficinaEntity.class);
    }
}
