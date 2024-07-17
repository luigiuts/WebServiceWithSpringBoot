package com.Parcial.Inmobiliaria.Service;

import com.Parcial.Inmobiliaria.Repository.Entity.ClienteEntity;

public interface ClienteService {
    ClienteEntity save(ClienteEntity cliente);

    ClienteEntity update(Long id, ClienteEntity cliente);
}
