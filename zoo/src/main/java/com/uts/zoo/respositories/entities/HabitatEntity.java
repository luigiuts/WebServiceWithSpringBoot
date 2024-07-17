package com.uts.zoo.respositories.entities;

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
@Table(name = "habitas")
public class HabitatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double Temperatura;
    private HabitatEntity hab;

    @ManyToOne
    @JoinColumn(name = "zologico_id")
    @JsonIgnoreProperties("habitas")
    private ZooEntity zoo;
}
