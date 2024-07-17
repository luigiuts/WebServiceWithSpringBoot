package com.invoice.co.invoice.repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="productos")
@Data
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private Double salePrice;
    @Column(nullable = true)
    private Double buyPrice;
    @Column(nullable = true)
    private String code;
    @Column(nullable = true)
    private String description;

}
