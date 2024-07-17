package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Repository.ClienteRepository;
import com.Parcial.Inmobiliaria.Repository.Entity.ClienteEntity;
import com.Parcial.Inmobiliaria.Repository.Entity.OficinaEntity;
import com.Parcial.Inmobiliaria.Service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clientRepository;

    @Override
    public ClienteEntity save(ClienteEntity cliente) {
            clientRepository.save(cliente);
            if(cliente.getId()!=null){
                clientRepository.save(cliente);
                return cliente;
            }else{
                throw new UnsupportedOperationException("Se guardo el cliente en la bd");
            }
        
    
    }

    @Override
    public ClienteEntity update(Long id, ClienteEntity cliente) {
        Optional<ClienteEntity> clientOptional =  clientRepository.findById(id);
        
        if(clientOptional.isPresent()){
            ClienteEntity clientCurrent = clientOptional.get();
            clientCurrent.setNombre(cliente.getNombre());
            clientCurrent.setApellido(cliente.getApellido());
            clientCurrent.setEmail(cliente.getEmail());
            clientCurrent.setCelular(cliente.getCelular());
            clientRepository.save(clientCurrent);

            return clientCurrent;


        }else{

            throw new NullPointerException("no existe el cliente con ese id "+id);



        }
    }


}
