package com.Parcial.Inmobiliaria.Dto.Convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Parcial.Inmobiliaria.Dto.VisitaDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.VisitaEntity;

@Component
public class VisitaDTOConvert {
    private final ModelMapper modelMapper;

    public VisitaDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public VisitaDTO convertVisitaDTO(VisitaEntity visitaEntity) {
        return modelMapper.map(visitaEntity, VisitaDTO.class);
    }

    public VisitaEntity convertVisitaEntity(VisitaDTO visitaDTO) {
        return modelMapper.map(visitaDTO, VisitaEntity.class);
    }
}
