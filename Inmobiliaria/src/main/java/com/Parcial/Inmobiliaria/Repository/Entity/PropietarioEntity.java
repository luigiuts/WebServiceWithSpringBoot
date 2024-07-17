package com.Parcial.Inmobiliaria.Repository.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "propietario")
@Data
public class PropietarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;

    @OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL)
    private List<InmuebleEntity> inmuebles;

    
}