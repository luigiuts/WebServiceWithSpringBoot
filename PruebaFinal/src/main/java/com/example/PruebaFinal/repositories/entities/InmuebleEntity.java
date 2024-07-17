package com.example.PruebaFinal.repositories.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "inmueble")
@Data
public class InmuebleEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String referencia;
    @Column(nullable = true) 
    private String superficie;
    @Column(nullable = true)
    private String direccion;
    @Column(nullable = true)
    private String precio;
    @Column(nullable = true)
    private String tipo;
    @Column(nullable = true)
    private String propietario;
    @Column(nullable = true)
    private String llaves;
    @ManyToOne()
    @JoinColumn(name = "oficina_id")
    private OficinaEntity oficina;
    @ManyToOne()
    @JoinColumn(name = "ciudad_id")
    private ZonaCiudadEntity ciudad;
    @OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL)//SIEMPRE VA DEL LADO DEL MUCHO
    private List<VisitaEntity> visitas;

}
