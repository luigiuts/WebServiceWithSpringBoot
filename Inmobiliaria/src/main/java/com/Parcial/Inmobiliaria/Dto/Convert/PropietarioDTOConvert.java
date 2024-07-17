package com.Parcial.Inmobiliaria.Dto.Convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Parcial.Inmobiliaria.Dto.PropietarioDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.PropietarioEntity;

@Component
public class PropietarioDTOConvert {
    private final ModelMapper modelMapper;

    public PropietarioDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PropietarioDTO convertPropietarioDTO(PropietarioEntity propietarioEntity) {
        return modelMapper.map(propietarioEntity, PropietarioDTO.class);
    }

    public PropietarioEntity convertPropietarioEntity(PropietarioDTO propietarioDTO) {
        return modelMapper.map(propietarioDTO, PropietarioEntity.class);
    }
}
