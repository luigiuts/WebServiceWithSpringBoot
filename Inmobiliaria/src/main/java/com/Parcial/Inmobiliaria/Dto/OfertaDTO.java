package com.Parcial.Inmobiliaria.Dto;

import lombok.Data;

@Data
public class OfertaDTO {
    private Long id;
    private double valorMax;
    private Double valorMin;
    private Boolean estado;
    private String descripcion;
    private String categoria;
}
