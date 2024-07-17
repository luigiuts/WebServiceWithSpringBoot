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
@Table(name = "clientes")
@Data
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true, unique = true)
    private String cedula;
    @Column(nullable = true)
    private String nombre;
    @Column(nullable = true)
    private String telefono;
    @OneToMany(mappedBy = "cliente")//SIEMPRE VA DEL LADO DEL MUCHO
    private List<VisitaEntity> visitas;
}
