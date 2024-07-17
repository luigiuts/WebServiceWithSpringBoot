package com.Parcial.Inmobiliaria.Dto.Convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Parcial.Inmobiliaria.Dto.OfertaDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.OfertaEntity;

@Component
public class OfertaDTOConvert {
    private final ModelMapper modelMapper;

    public OfertaDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public OfertaDTO convertOfertaDTO(OfertaEntity ofertaEntity) {
        return modelMapper.map(ofertaEntity, OfertaDTO.class);
    }

    public OfertaEntity convertOfertaEntity(OfertaDTO ofertaDTO) {
        return modelMapper.map(ofertaDTO, OfertaEntity.class);
    }
}
