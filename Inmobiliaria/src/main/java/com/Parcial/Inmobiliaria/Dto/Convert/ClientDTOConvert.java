package com.Parcial.Inmobiliaria.Dto.Convert;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.Parcial.Inmobiliaria.Dto.ClienteDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.ClienteEntity;

@Component
public class ClientDTOConvert {

    private final ModelMapper modelMapper;

    public ClientDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ClienteDTO convertClientDTO(ClienteEntity clientEntity) {
        return modelMapper.map(clientEntity, ClienteDTO.class);
    }

    public ClienteEntity convertClientEntity(ClienteDTO clientDTO) {
        return modelMapper.map(clientDTO, ClienteEntity.class);
    }
}

