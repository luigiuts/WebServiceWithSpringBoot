package com.Parcial.Inmobiliaria.Repository.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "oferta")
@Data
public class OfertaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double valorMax;
    private Double valorMin;
    private Boolean estado;
    private String descripcion;
    private String categoria;

    @OneToOne
    @JoinColumn(name = "inmueble_id")
    private InmuebleEntity inmueble;

}