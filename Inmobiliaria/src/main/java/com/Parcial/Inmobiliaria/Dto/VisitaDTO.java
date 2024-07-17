package com.Parcial.Inmobiliaria.Dto;

import java.util.Date;

import lombok.Data;

@Data
public class VisitaDTO {
    private Long id;
    private Date fechaHora;
    private String comentario;
}
