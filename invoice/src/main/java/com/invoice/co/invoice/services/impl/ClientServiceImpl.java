package com.invoice.co.invoice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.invoice.co.invoice.dto.ClientDTO;
import com.invoice.co.invoice.dto.ClientDTOConvert;
import com.invoice.co.invoice.repositories.ClientRepository;
import com.invoice.co.invoice.repositories.entities.ClientEntity;
import com.invoice.co.invoice.services.ClientServices;

@Service
public class ClientServiceImpl implements ClientServices{

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientDTOConvert clientDTOConvert;

    
    //public List<ClientDTO> findAll() {
    @Override
    public List<ClientDTO> findAll() {
        List<ClientEntity> listClientEntity = (List<ClientEntity>) clientRepository.findAll();//Java 8 pa arriba
        return  listClientEntity.stream()
        .map(x->clientDTOConvert.convertClientDTO(x))
        .toList();

        

        //Metodo antiguo
        // List <ClientDTO> listClientDTO = new ArrayList<>();
        // List<ClientEntity> listClientEntity = (List<ClientEntity>) clientRepository.findAll();

        // for(ClientEntity clientEntity : listClientEntity){
        //     listClientDTO.add(clientDTOConvert.converClientDTO(clientEntity));
        // }
        // return listClientDTO;
    }

    @Override
    public ClientEntity save(ClientEntity cliente) {
        clientRepository.save(cliente);
        if(cliente.getId()!=null){
            clientRepository.save(cliente);
            return cliente;
        }else{
            throw new UnsupportedOperationException("Se guardo el cliente en la bd");
        }
    }

    @Override
    @Transactional
    public ClientEntity update(Long id, ClientEntity cliente) {
        
        Optional<ClientEntity> clientOptional =  clientRepository.findById(id);
        
        if(clientOptional.isPresent()){
            ClientEntity clientCurrent = clientOptional.get();
            clientCurrent.setFirstNames(cliente.getFirstNames());
            clientCurrent.setLastNames(cliente.getLastNames());
            clientCurrent.setAddress(cliente.getAddress());
            clientCurrent.setPhone(cliente.getPhone());
            clientCurrent.setEmail(cliente.getEmail());
            clientRepository.save(clientCurrent);

            return clientCurrent;


        }else{

            throw new NullPointerException("no existe el cliente con ese id "+id);



        }


    }

    @Override
    @Transactional
    public ClientEntity findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        
        clientRepository.deleteById(id);
    }
    
}
