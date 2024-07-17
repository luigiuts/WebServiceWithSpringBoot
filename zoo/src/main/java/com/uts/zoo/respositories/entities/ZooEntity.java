package com.uts.zoo.respositories.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "zoologicos")
public class ZooEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ciudad;
    private String pais;
    private String area;
    private Double presupuesto;
    @OneToMany(mappedBy = "zoo")
    @JsonIgnoreProperties("zoo")
    private List<AnimalEntity> animales;
    @OneToMany(mappedBy = "hab")
    @JsonIgnoreProperties("hab")
    private List<HabitatEntity> habitas;
    

}
