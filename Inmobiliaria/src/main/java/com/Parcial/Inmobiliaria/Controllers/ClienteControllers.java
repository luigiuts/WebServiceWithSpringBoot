package com.Parcial.Inmobiliaria.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parcial.Inmobiliaria.Repository.Entity.ClienteEntity;
import com.Parcial.Inmobiliaria.Repository.Entity.OficinaEntity;
import com.Parcial.Inmobiliaria.Service.ClienteService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class ClienteControllers {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/save")
    public ClienteEntity save(@RequestBody ClienteEntity cliente){
        return clienteService.save(cliente);
    }

    @PostMapping("/update/{id}")
    public ClienteEntity update(@PathVariable Long id, @RequestBody ClienteEntity cliente){
        return clienteService.update(id,cliente);
    }
}
