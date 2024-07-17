package com.Parcial.Inmobiliaria.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Parcial.Inmobiliaria.Repository.Entity.VisitaEntity;
import com.Parcial.Inmobiliaria.Service.VisitaService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/visita")
@AllArgsConstructor
public class VisitaControllers {

    @Autowired
    private VisitaService visitaService;

    @PostMapping("/save")
    public VisitaEntity save(@RequestBody VisitaEntity visita) {
        return visitaService.save(visita);
    }
}
