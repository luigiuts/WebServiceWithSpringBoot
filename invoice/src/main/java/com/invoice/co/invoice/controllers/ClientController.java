package com.invoice.co.invoice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoice.co.invoice.dto.ClientDTO;
import com.invoice.co.invoice.repositories.entities.ClientEntity;
import com.invoice.co.invoice.services.ClientServices;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    @Autowired
    private ClientServices clientService;
    
    @GetMapping("/")
    public List<ClientDTO> findAll(){
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public ClientEntity findById(@PathVariable Long id){
        return clientService.findById(id);
    }

    @PostMapping("/update/{id}")
    public ClientEntity update(@PathVariable Long id, @RequestBody ClientEntity cliente){

        return clientService.update(id,cliente);
    }

    @PostMapping("/save")
    public ClientEntity save(@RequestBody ClientEntity cliente){
         return clientService.save(cliente);
    }


}
