package com.invoice.co.invoice.services;

import java.util.List;

import com.invoice.co.invoice.dto.ClientDTO;
import com.invoice.co.invoice.repositories.entities.ClientEntity;

public interface ClientServices {
    
    List<ClientDTO> findAll();
    
    ClientEntity save(ClientEntity cliente);
    
    ClientEntity update(Long id, ClientEntity cliente);

    ClientEntity findById(Long id);

    void deleteById(Long id);

}
