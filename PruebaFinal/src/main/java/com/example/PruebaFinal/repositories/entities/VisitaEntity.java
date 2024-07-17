package com.example.PruebaFinal.repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "visitas")
@Data
public class VisitaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    @Column(nullable = true)
    private String hora;
    private String comentario;
    @ManyToOne()
    @JoinColumn(name = "cliente_id")
    private ClienteEntity cliente;
    @ManyToOne()
    @JoinColumn(name = "inmueble_id")
    private InmuebleEntity inmueble;
}
