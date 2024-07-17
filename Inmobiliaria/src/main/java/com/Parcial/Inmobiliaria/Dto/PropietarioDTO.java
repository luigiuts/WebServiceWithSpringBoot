package com.Parcial.Inmobiliaria.Dto;

import lombok.Data;

@Data
public class PropietarioDTO {
    private Long id;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;
}
