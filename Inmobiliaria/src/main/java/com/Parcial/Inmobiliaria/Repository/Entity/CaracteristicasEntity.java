package com.Parcial.Inmobiliaria.Repository.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "caracteristicas")
@Data
public class CaracteristicasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoria;
    private Integer cantidad;
    private String descripcion;

    @ManyToOne()
    @JoinColumn(name = "inmueble_id")
    private InmuebleEntity inmuebles;
}
