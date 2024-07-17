package com.Parcial.Inmobiliaria.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parcial.Inmobiliaria.Dto.InmuebleDTO;
import com.Parcial.Inmobiliaria.Repository.Entity.InmuebleEntity;
import com.Parcial.Inmobiliaria.Service.InmuebleService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/inmuebles")
@AllArgsConstructor
public class InmuebleControllers {


    @Autowired
    private InmuebleService inmuebleService;
    
    @GetMapping("/")
    public List<InmuebleDTO> findAll(){

        return inmuebleService.findAll();
    }

    @GetMapping("/disponible")
    public List<InmuebleDTO> findAllDisponible(){

        return inmuebleService.findAllDisponible();
    }

    @GetMapping("/{id}")
    public InmuebleEntity findById(@PathVariable Long id){
        return inmuebleService.findById(id);
    }

    @PostMapping("/update/{id}")
    public InmuebleEntity update(@PathVariable Long id, @RequestBody InmuebleEntity inmueble){

        return inmuebleService.update(id,inmueble);
    }

    @PostMapping("/save")
    public InmuebleDTO save(@RequestBody InmuebleDTO inmueble){
        return inmuebleService.save(inmueble);
    }


}
