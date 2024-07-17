package com.example.PruebaFinal.repositories.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "oficina")
@Data
public class OficinaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String nombre;
    @Column(nullable = true, unique = true)
    private String ubicacion;
    @Column(nullable = true)
    private String phone;
    @OneToMany(mappedBy = "oficina", cascade = CascadeType.ALL)//SIEMPRE VA DEL LADO DEL MUCHO
    private List<InmuebleEntity> inmuebles;
}
