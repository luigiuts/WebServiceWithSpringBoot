package com.Parcial.Inmobiliaria.Service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Parcial.Inmobiliaria.Repository.OficinaRepository;
import com.Parcial.Inmobiliaria.Repository.Entity.OficinaEntity;
import com.Parcial.Inmobiliaria.Service.OficinaService;

import jakarta.transaction.Transactional;

@Service
public class OficinaServiceImpl implements OficinaService{

    @Autowired
    private OficinaRepository oficinaRepository;


    @Override
    public OficinaEntity save(OficinaEntity oficina) {
        oficinaRepository.save(oficina);
        if(oficina.getId()!=null){
            oficinaRepository.save(oficina);
            return oficina;
        }else{
            throw new UnsupportedOperationException("Se guardo el cliente en la bd");
        }
    }

    @Override
    public OficinaEntity findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<OficinaEntity> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<OficinaEntity> findAllDisponible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllDisponible'");
    }

    @Override
    public OficinaEntity update(Long id, OficinaEntity oficina) {

        Optional<OficinaEntity> clientOptional =  oficinaRepository.findById(id);
        
        if(clientOptional.isPresent()){
            OficinaEntity clientCurrent = clientOptional.get();
            clientCurrent.setUbicacion(oficina.getUbicacion());
            oficinaRepository.save(clientCurrent);

            return clientCurrent;


        }else{

            throw new NullPointerException("no existe el cliente con ese id "+id);



        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        oficinaRepository.deleteById(id);
    }
    
}
