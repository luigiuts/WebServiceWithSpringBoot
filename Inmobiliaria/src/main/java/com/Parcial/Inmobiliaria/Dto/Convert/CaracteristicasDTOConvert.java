package com.Parcial.Inmobiliaria.Dto.Convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Parcial.Inmobiliaria.Dto.CaracteristicasDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.CaracteristicasEntity;

@Component
public class CaracteristicasDTOConvert {
    private final ModelMapper modelMapper;

    public CaracteristicasDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CaracteristicasDTO convertCaracteristicasDTO(CaracteristicasEntity caracteristicaEntity) {
        return modelMapper.map(caracteristicaEntity, CaracteristicasDTO.class);
    }

    public CaracteristicasEntity convertCaracteristicasEntity(CaracteristicasDTO caracteristicaDTO) {
        return modelMapper.map(caracteristicaDTO, CaracteristicasEntity.class);
    }
}
