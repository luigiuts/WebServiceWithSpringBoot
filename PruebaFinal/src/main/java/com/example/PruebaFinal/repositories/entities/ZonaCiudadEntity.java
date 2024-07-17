package com.example.PruebaFinal.repositories.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ciudad")
@Data
public class ZonaCiudadEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String nombre;
    private String detalles;
    @OneToMany(mappedBy = "ciudad")//SIEMPRE VA DEL LADO DEL MUCHO
    private List<InmuebleEntity> inmuebles;
}
