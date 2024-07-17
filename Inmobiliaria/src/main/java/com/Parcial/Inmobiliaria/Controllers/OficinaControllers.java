package com.Parcial.Inmobiliaria.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parcial.Inmobiliaria.Repository.Entity.OficinaEntity;
import com.Parcial.Inmobiliaria.Service.OficinaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/oficinas")
@AllArgsConstructor
public class OficinaControllers {

    
    @Autowired
    private OficinaService oficinaService;

    @PostMapping("/guardar")
    public OficinaEntity save(@RequestBody OficinaEntity oficina){
        return oficinaService.save(oficina);
    }

    
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        oficinaService.deleteById(id);
    }

    @PostMapping("/update/{id}")
    public OficinaEntity update(@PathVariable Long id, @RequestBody OficinaEntity oficina){
        return oficinaService.update(id,oficina);
    }




    
}
