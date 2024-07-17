package com.Parcial.Inmobiliaria.Repository.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "inmueble")
@Data
public class InmuebleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direccion;
    private String ciudad;
    private String pais;
    private String zona;
    private boolean llaves;
    private Double area;
    private String categoria;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private PropietarioEntity propietario;

    @OneToOne(mappedBy = "inmueble", cascade = CascadeType.ALL)
    private OfertaEntity oferta;

    @ManyToOne
    @JoinColumn(name = "oficina_id")
    private OficinaEntity oficina;

    @OneToMany(mappedBy = "inmueble", cascade = CascadeType.ALL)
    private List<VisitaEntity> visitas;

    @OneToMany(mappedBy = "inmuebles", cascade = CascadeType.ALL)//SIEMPRE VA DEL LADO DEL MUCHO
    private List<CaracteristicasEntity> caracteristica;
   
}
