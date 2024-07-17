package com.Parcial.Inmobiliaria.Dto.Convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Parcial.Inmobiliaria.Dto.InmuebleDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.InmuebleEntity;

@Component
public class InmuebleDTOConvert {
    private final ModelMapper modelMapper;

    public InmuebleDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public InmuebleDTO convertInmuebleDTO(InmuebleEntity inmuebleEntity) {
        return modelMapper.map(inmuebleEntity, InmuebleDTO.class);
    }

    public InmuebleEntity convertInmuebleEntity(InmuebleDTO inmuebleDTO) {
        return modelMapper.map(inmuebleDTO, InmuebleEntity.class);
    }
}
