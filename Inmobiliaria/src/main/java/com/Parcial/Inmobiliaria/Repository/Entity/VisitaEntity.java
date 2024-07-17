package com.Parcial.Inmobiliaria.Repository.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "visita")
@Data
public class VisitaEntity {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fechaHora;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "inmueble_id")
    private InmuebleEntity inmueble;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteEntity cliente;



   
}
