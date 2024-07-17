package com.uts.zoo.respositories.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "animales")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sexo;
    private Date fechaNacimiento;
    private String pais;
    private String continente;
    @ManyToOne
    @JoinColumn(name = "especie_id")
    private SpecieEntity especie;
    @ManyToOne
    @JoinColumn(name = "zologico_id")
    @JsonIgnoreProperties("animales")
    private ZooEntity zoo;

    

}
