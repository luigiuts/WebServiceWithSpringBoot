package com.Parcial.Inmobiliaria.Dto;

import java.util.List;

import com.Parcial.Inmobiliaria.Repository.Entity.VisitaEntity;

import lombok.Data;

@Data
public class InmuebleDTO {
    private Long id;
    private String direccion;
    private String ciudad;
    private String pais;
    private String zona;
    private Boolean llaves;
    private Double area;
    private String categoria;
    private String estado;
    private List<VisitaEntity> visitas;
   
}
