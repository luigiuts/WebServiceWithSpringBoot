package com.uts.zoo.respositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "especies")
public class SpecieEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nombreEspecie;
     private String nombreVulgar;  
     private String nombreCientifico;
     private String familia;
     private String extincion;
    

}
