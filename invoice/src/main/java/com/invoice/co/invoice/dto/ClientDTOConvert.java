package com.invoice.co.invoice.dto;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.invoice.co.invoice.repositories.entities.ClientEntity;

@Component
public class ClientDTOConvert {

    private final ModelMapper modelMapper;

    public ClientDTOConvert(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ClientDTO convertClientDTO(ClientEntity clientEntity) {
        return modelMapper.map(clientEntity, ClientDTO.class);
    }

    public ClientEntity convertClientEntity(ClientDTO clientDTO) {
        return modelMapper.map(clientDTO, ClientEntity.class);
    }
}

